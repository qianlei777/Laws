package com.kgc.laws.law.mycontroller;

import com.github.pagehelper.PageInfo;
import com.kgc.laws.law.pojo.Clause;
import com.kgc.laws.law.pojo.Laws;
import com.kgc.laws.law.service.ClauseService;
import com.kgc.laws.law.service.LawsService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.xml.ws.RequestWrapper;
import java.util.List;

/**
 * @author shkstart
 * @create 2020-12-23 16:52
 */

@Controller
public class MyController {
    @Resource
    ClauseService clauseService;

    @Resource
    LawsService lawsService;

    @RequestMapping("/getClauseAll")
    public String getClauseAll(Integer pageNum, Integer lawsid, String clauseid, String like, Model model) {
        System.out.println(pageNum);
        System.out.println(lawsid);
        System.out.println(clauseid);
        System.out.println(like);
        if (pageNum == null) {
            pageNum = 1;
        }
        int pageSize = 1;

        PageInfo<Clause> pageInfo = clauseService.selectAllBy(pageNum, pageSize, lawsid, clauseid, like);
        model.addAttribute("pageInfo", pageInfo);
        List<Laws> lawsAll = lawsService.getLawsAll();
        model.addAttribute("laws", lawsAll);
        model.addAttribute("lawsid", lawsid);
        model.addAttribute("pageNum", pageNum);
        model.addAttribute("clauseid", clauseid);
        model.addAttribute("like", like);
        return "clause-info";
    }


}
