package com.kgc.laws.law.controller.main.yaya;

import com.kgc.laws.law.controller.main.yaya.util.TelPhone;
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

    private String num = "123456";

    @Resource
    LoginService loginService;

    @RequestMapping("login")
    public String loginUsers(String userphone, String password, HttpSession session,Model model){
        Users users = loginService.getUsers(userphone, password);
        if (users!=null){
            session.setAttribute("user",users);
            return "redirect:/getAllUser";
        }else {
            model.addAttribute("msg","登录名或验证码错误！！！");
            return "html/login";
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

    @RequestMapping("phoneYan")
    @ResponseBody
    public String phoneYan(String phone){
        String flag = "1";
        num = TelPhone.telcode(phone);
        return flag;
    }

    @RequestMapping("YanYan")
    @ResponseBody
    public String yanYan(String yzm) {
        String flag = "false";
        if (yzm.equals(num)) {
            flag = "true";
        }
        return flag;
    }
    @RequestMapping("phoneYanZheng")
    @ResponseBody
    public String phoneYanZheng(String phone){
        String flag="false";
        int userByPhone = loginService.getUserByPhone(phone);
        if (userByPhone>0){
            flag="true";
        }
        return flag;
    }
}
