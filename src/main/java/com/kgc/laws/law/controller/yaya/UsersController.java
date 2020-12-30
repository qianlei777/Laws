package com.kgc.laws.law.controller.yaya;

import com.github.pagehelper.PageInfo;
import com.kgc.laws.law.pojo.Admin;
import com.kgc.laws.law.pojo.Users;
import com.kgc.laws.law.service.users.GetUsers.UsersService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

@Controller
public class UsersController {
    @Resource
    UsersService usersService;


    @RequestMapping("/getAllUser")
    public String getAllUsers(String phone,Integer pageNum, Model model){
        if (pageNum==null){
            pageNum=1;
        }
        int pageSize=10;
        PageInfo<Users> allUsers = usersService.getAllUsers(phone, pageNum, pageSize);
        model.addAttribute("allUsers",allUsers);
        model.addAttribute("phone",phone);
        model.addAttribute("pageNum",pageNum);
        return "users";
    }
    @RequestMapping("/gai")
    @ResponseBody
    public String updateUser(Users users){
        if (users.getMembertype()==1){
            users.setMembertype(0);
        }else if (users.getMembertype()==0){
            users.setMembertype(1);
        }
        String flag="false";
        if (usersService.updateUsers(users)>0){
            flag="true";
        }
        return flag;
    }

    @RequestMapping("AdminLogin")
    public String getAdmin(String phone, String password, HttpSession session,Model model){
        Admin admin = usersService.getAdmin(phone, password);
        if (admin!=null){
            session.setAttribute("admin",admin);
            return "redirect:/getAllUser";
        }else {
            model.addAttribute("msg","用户名或密码错误！！！");
            return "adminLogin";
        }
    }

    @RequestMapping("phoneGai")
    @ResponseBody
    public String phoneGai(Users users){
        String flag="false";
        int i = usersService.updateUsers(users);
        if (i>0){
            flag="true";
        }
        return flag;
    }
    @RequestMapping("/miGai")
    @ResponseBody
    public String miGai(Users users){
        String flag="false";
        int i = usersService.updateUsers(users);
        if (i>0){
            flag="true";
        }
        return flag;
    }

    @RequestMapping("exit")
    public String exit(HttpSession session){
        session.invalidate();
        return "html/login";
    }
}
