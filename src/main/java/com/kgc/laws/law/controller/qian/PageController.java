package com.kgc.laws.law.controller.qian;

import com.kgc.laws.law.pojo.Laws;
import com.kgc.laws.law.pojo.Page;
import com.kgc.laws.law.service.qian.LawService;
import com.kgc.laws.law.service.qian.PageService;
import com.sun.deploy.net.HttpResponse;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import sun.security.provider.MD2;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

@Controller
public class PageController {
    @Resource
    PageService pageService;
    @Resource
    LawService lawService;
    //跳转添加顶级目录页面
    @RequestMapping("addFirstPage-html")
    public String addPage(Model model){
        List<Laws> allLaw = lawService.getAllLaw();
        Integer pageCount = pageService.PageCount();
        model.addAttribute("allLaws",allLaw);
        model.addAttribute("pageCount",pageCount);
        return "q-firstpage-add";
    }
    //添加成功跳转所有目录页面
    @RequestMapping("addFirstPage")
    @ResponseBody
    public String addFirstPage(Page page) throws IOException {
        Integer num = pageService.addFirstPage(page);
        if(num>0){
            return "<script>alert('添加目录成功');location.href='allPage'</script>";
        }
        return"";
    }
    //全部/模糊查询所有目录
    @RequestMapping("allPage")
    public String allPage(Model model){
        List<Laws> allLaw = lawService.getAllLaw();
        model.addAttribute("allLaws",allLaw);
        return "q-allpage";
    }
    //添加下级目录
    @PostMapping("addNextPage")
    @ResponseBody
    public String adNextPage(Page page){
        Integer num = pageService.addFirstPage(page);
        if(num>0){
            return "<script>alert('添加目录成功');location.href='allPage'</script>";
        }
        return "";
    }
    //跳转添加下级目录页面
    @RequestMapping("nextPage-html")
    public String getPage(Integer id,Model model){
        Page page = pageService.getPage(id);
        List<Laws> allLaw = lawService.getAllLaw();
        model.addAttribute("allLaws",allLaw);
        model.addAttribute("nextPage",page);
        return "q-nextpage-add";
    }
    //跳转修改下一级目录页面
    @RequestMapping("uNextPage-html")
    public String updatePage(Integer id,Model model){
        Page page = pageService.getPage(id);
        List<Laws> allLaw = lawService.getAllLaw();
        model.addAttribute("allLaws",allLaw);
        model.addAttribute("nextPage",page);
        model.addAttribute("num",1);
        return "q-nextpage-add";
    }
    //修改目录
    @PutMapping("addNextPage")
    @ResponseBody
    public String updatePage(Page page){
        Integer num = pageService.updatePage(page);
        if(num>0){
            return "<script>alert('修改目录成功');location.href='allPage'</script>";
        }
        return "";
    }
}
