package com.kgc.laws.law.controller.qian;

import com.kgc.laws.law.pojo.Laws;
import com.kgc.laws.law.pojo.Page;
import com.kgc.laws.law.service.qian.LawService;
import com.kgc.laws.law.service.qian.PageService;
import com.sun.deploy.net.HttpResponse;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

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
}
