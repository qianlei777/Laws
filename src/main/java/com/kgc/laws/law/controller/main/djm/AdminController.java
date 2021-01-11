package com.kgc.laws.law.controller.main.djm;

import com.github.pagehelper.PageInfo;
import com.kgc.laws.law.pojo.Admin;
import com.kgc.laws.law.service.djm.AdminService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

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

    @RequestMapping("/toaddAdmin")
    public String toaddAdmin(){
        return "d-addAdmin";
    }
    @RequestMapping("/addAdmin")
    @ResponseBody
    public String addAdmin(Admin admin){
        int i = adminService.insertAdmin(admin);
        System.out.println(admin.getRole());
        if(i>0){
            return "<script>alert('添加成功');location.href='/AdminInfo'</script>";
        }else{
            return "<script>alert('添加失败');location.href='/toaddAdmin'</script>";
        }
    }

    @RequestMapping("/toupdateAdmin")
    public String toupdateAdmin(int id,Model model){
        Admin adminById = adminService.getAdminById(id);
        model.addAttribute("adminById",adminById);
        return "d-updateAdmin";
    }

    @RequestMapping("/updateAdmin")
    @ResponseBody
    public String updateAdmin(Admin admin){
        System.out.println(admin.getId());
        System.out.println(admin.getRole());
        System.out.println(admin.getPassword());
        System.out.println(admin.getAname());
        System.out.println(admin.getAdddata());
        int i = adminService.updateAdmin(admin);
        if(i>0){
            return "<script>alert('修改成功');location.href='/AdminInfo'</script>";
        } else {
            return "<script>alert('修改失败');location.href='/AdminInfo'</script>";
        }
    }

    //跳转  网站设置
    @RequestMapping("/towzsz")
    public String towzsz(){
        return "d-wzsz";
    }
    //跳转  公司介绍
    @RequestMapping("/togsjs")
    public String togsjs(){
        return "d-gsjs";
    }
    //跳转  服务协议
    @RequestMapping("/tofwxy")
    public String tofwxy(){
        return "d-fwxy";
    }
    //跳转  邮件设置
    @RequestMapping("/toyjsz")
    public String toyjsz(){
        return "d-yjsz";
    }
    //跳转 短信设置
    @RequestMapping("/todxsz")
    public String todxsz(){
        return "d-dxsz";
    }

}
