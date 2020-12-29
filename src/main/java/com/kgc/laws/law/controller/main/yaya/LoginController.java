package com.kgc.laws.law.controller.main.yaya;

import com.kgc.laws.law.pojo.Users;
import com.kgc.laws.law.service.users.LoginUsers.LoginService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

@Controller
public class LoginController {
    @Resource
    LoginService loginService;

    @RequestMapping("login")
    @ResponseBody
    public String loginUsers(String userphone, String password, HttpSession session){
        Users users = loginService.getUsers(userphone, password);
        if (users!=null){
            session.setAttribute("user",users);
            return "users";
        }else {
            return "<script>alert('用户名或密码错误！！！');location.href='login.html'</script>";
        }
    }

    @RequestMapping("yanPhone")
    @ResponseBody
    public String yanPhone(String phone){
        String flag="false";
        int userByPhone = loginService.getUserByPhone(phone);
        if (userByPhone>0){
            flag="true";
        }
        return flag;
    }
    @RequestMapping("addUsers")
    @ResponseBody
    public String addUsers(Users users){
        Integer addUsers = loginService.AddUsers(users);
        if (addUsers>0){
            return "<script>alert('注册成功！！！');location.href='rest.html'</script>";
        }
        return "<script>alert('注册失败！！！');location.href='rest.html'</script>";
    }
}
