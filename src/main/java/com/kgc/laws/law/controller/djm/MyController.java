package com.kgc.laws.law.controller.djm;

import com.github.pagehelper.PageInfo;
import com.kgc.laws.law.pojo.Clause;
import com.kgc.laws.law.pojo.Laws;
import com.kgc.laws.law.service.djm.ClauseService;
import com.kgc.laws.law.service.djm.LawsService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
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

    //m模糊查询 分页
    @RequestMapping("/getClauseAll")
    public String getClauseAll(Integer pageNum, Integer lawsid, String clauseid, String like, Model model) {
//        System.out.println(pageNum);
//        System.out.println(lawsid);
//        System.out.println(clauseid);
//        System.out.println(like);
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
        return "d-clauseinfo";
    }

    @RequestMapping("/toaddClause")
    public String toadd(Model model) {
        List<Laws> lawsAll = lawsService.getLawsAll();
        model.addAttribute("laws", lawsAll);
        return "d-addClause";
    }


    @RequestMapping("/addClause")
    @ResponseBody
    public String addClause(Clause clause, Model model) {
        int i = clauseService.insertClause(clause);
        if (i > 0) {
            return "<script>alert('添加成功');location.href='/toaddClause'</script>";
        }
        return "<script>alert('添加失败');location.href='/toaddClause'</script>";
    }

    @RequestMapping("/toupdateClause")
    public String toupdateClause(Integer id, Model model) {
        Clause clause = clauseService.getClauseById(id);
        model.addAttribute("clause", clause);
        List<Laws> lawsAll = lawsService.getLawsAll();
        model.addAttribute("laws", lawsAll);
        return "d-updateClause";
    }

    @RequestMapping("/updataClause")
    public String updataClause(Clause clause) {
        int i = clauseService.updataClauseByClause(clause);
        if (i > 0) {
            return "<script>alert('修改成功');location.href='/getClauseAll'</script>";
        }
        return "<script>alert('修改失败');location.href='/toupdateClause?id=" + clause.getId() + "'</script>";
    }

    @RequestMapping("/delClause")
    @ResponseBody
    public String delClause(Integer id) {
        int i = clauseService.updateById(id);
        if (i > 0) {
            return "<script>alert('删除成功');location.href='/getClauseAll'</script>";
        }
        return "<script>alert('删除失败');location.href='/getClauseAll'</script>";
    }
}
