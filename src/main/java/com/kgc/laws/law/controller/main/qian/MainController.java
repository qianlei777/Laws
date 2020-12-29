package com.kgc.laws.law.controller.main.qian;

import com.kgc.laws.law.pojo.*;
import com.kgc.laws.law.service.djm.ClauseService;
import com.kgc.laws.law.service.qian.FavoriteService;
import com.kgc.laws.law.service.qian.LawService;
import com.kgc.laws.law.service.qian.PageService;
import com.kgc.laws.law.service.qian.impl.FavoriteServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;

@Controller
public class MainController {
    @Resource
    LawService lawService;
    @Resource
    PageService pageService;
    @Resource
    ClauseService clauseService;
    @Resource
    FavoriteService favoriteService;
    //跳转前端首页
    @RequestMapping("/main")
    public String getAllClause(Model model, HttpSession session){
        List<Laws> allLaws= lawService.getAllLaw();
        Users users = (Users)session.getAttribute("user");
        if(users!=null){
            List<Favorite> allFavorite = favoriteService.getAllFavorite(users.getId());
            model.addAttribute("allFav",allFavorite);
        }
        model.addAttribute("allLaws",allLaws);
        return"html/main";
    }
    //跳转法规目录页
    @RequestMapping("/allPandC")
    public String allPandC(Model model,Integer id){
        //获取当前法规的目录
        List<Page> allPage = pageService.getAllPage(id);
        List<Page> parentList = new ArrayList<>();
        //获取顶级目录
        for (Page page : allPage) {
            if(page.getPageparent()==0){
                parentList.add(page);
            }
        }
        model.addAttribute("allpage",parentList);
        return"html/pageAndClause";
    }
    //跳转条款显示页面
    @RequestMapping("/oneClause")
    public String getOneClause(Model model,Integer id,HttpSession session){
        Clause clauseById = clauseService.getClauseById(id);
        //通过工具类获取当前天条款的所有父级目录
        TreeMap<Integer, Page> parentName = pageService.getParentName(clauseById.getPageid());
        Users users = (Users)session.getAttribute("user");
        if(users!=null){
            //获取当前用户的收藏集合并判断是否有收藏条款
            List<Favorite> allFavorite = favoriteService.getAllFavorite(users.getId());
            List<Clause> favClause = new ArrayList<>();
            //获取用户收藏的条款集合
            if(allFavorite.size()>0){
                for (Favorite favorite : allFavorite) {
                    favClause.add(favorite.getClause());
                }
                System.out.println(favClause.size());
                model.addAttribute("allFav",favClause);
            }
        }
        model.addAttribute("parent",parentName);
        model.addAttribute("clause",clauseById);
        return"html/show-clause";
    }
    //跳转咨询页面
    @RequestMapping("/godisscuss")
    public String goDisscuss(){
        return "html/add-disscuss";
    }
}
