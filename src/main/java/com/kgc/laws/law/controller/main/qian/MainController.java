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
    @RequestMapping("/main")
    public String getAllClause(Model model){
        List<Laws> allLaws= lawService.getAllLaw();
        model.addAttribute("allLaws",allLaws);
        return"html/main";
    }
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
    @RequestMapping("/oneClause")
    public String getOneClause(Model model,Integer id){
        Clause clauseById = clauseService.getClauseById(id);
        TreeMap<Integer, String> parentName = pageService.getParentName(clauseById.getId());
        System.out.println(parentName.keySet().size());
        model.addAttribute("parent",parentName);
        return"html/show-clause";
    }
}
