package com.kgc.laws.law.controller.qian;

import com.kgc.laws.law.pojo.Page;
import com.kgc.laws.law.service.qian.PageService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

@Controller
public class PageController {
    @Resource
    PageService pageService;
    @RequestMapping("addPage")
    public String addPage(Page page){
        return"";
    }
}
