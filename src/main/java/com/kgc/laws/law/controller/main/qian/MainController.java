package com.kgc.laws.law.controller.main.qian;

import com.kgc.laws.law.pojo.Clause;
import com.kgc.laws.law.pojo.Laws;
import com.kgc.laws.law.pojo.Page;
import com.kgc.laws.law.service.djm.ClauseService;
import com.kgc.laws.law.service.qian.LawService;
import com.kgc.laws.law.service.qian.PageService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
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
    //跳转前端首页
    @RequestMapping("/main")
    public String getAllClause(Model model){
        List<Laws> allLaws= lawService.getAllLaw();
        model.addAttribute("allLaws",allLaws);
        return"html/main";
    }
    //跳转法规目录页
    @RequestMapping("/allPandC")
    public String allPandC(Model model,Integer id){
        List<Page> allPage = pageService.getAllPage(id);
        List<Page> parentList = new ArrayList<>();
        for (Page page : allPage) {
            if(page.getPageparent()==0){
                parentList.add(page);
            }
        }
        System.out.println(parentList.size());
        for (Page page : parentList) {
            System.out.println(page.getClauses().size());
        }
        model.addAttribute("allpage",parentList);
        return"html/pageAndClause";
    }
    //跳转条款显示页面
    @RequestMapping("/oneClause")
    public String getOneClause(Model model,Integer id){
        Clause clauseById = clauseService.getClauseById(id);
        TreeMap<Integer, Page> parentName = pageService.getParentName(clauseById.getPageid());
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
