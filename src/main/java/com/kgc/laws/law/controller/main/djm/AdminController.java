package com.kgc.laws.law.controller.main.djm;

import com.github.pagehelper.PageInfo;
import com.kgc.laws.law.pojo.Admin;
import com.kgc.laws.law.service.djm.AdminService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

/**
 * @author shkstart
 * @create 2020-12-28 15:56
 */

@Controller

public class AdminController {

    @Resource
    AdminService adminService;

    @RequestMapping("/toSetting")
    public String toSetting() {
        return "d-websetting";
    }

    @RequestMapping("/AdminInfo")
    public String AdminInfo(Integer pageNum, String phone, String name, Model model){
        if(pageNum==null){
            pageNum=1;
        }
        Integer pageSize = 2;

        PageInfo<Admin> adminInfo = adminService.getAdminInfo(pageNum, pageSize, phone, name);
        model.addAttribute("pageInfo",adminInfo);
        model.addAttribute("phone",phone);
        model.addAttribute("name",name);
        return "d-admininfo";

    }


}
