package com.kgc.laws.law.config;

import com.kgc.laws.law.interceptor.LoginHandlerInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
@Configuration
public class MvcConfig implements WebMvcConfigurer {
    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("users").setViewName("users");
        registry.addViewController("login.html").setViewName("html/login");
        registry.addViewController("adminLogin.html").setViewName("adminLogin");
        registry.addViewController("rest.html").setViewName("html/rest");
        registry.addViewController("myself.html").setViewName("html/myself");
        registry.addViewController("gaiPhone.html").setViewName("html/gaiPhone");
        registry.addViewController("gaiPassword.html").setViewName("html/gaiPassword");
    }
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new LoginHandlerInterceptor()).addPathPatterns("/getClauseAll","/toaddClause","/addClause","/toupdateClause","/updataClause","/delClause","/add","/fshow","/addlaw","/showall","/update","/addupdate","/personalone","/personnal","/up","/confirmpassword","/updatepassward","/addFirstPage-html","/addFirstPage","/allPage","/addNextPage","/nextPage-html","/uNextPage-html","/addNextPage","/getAllDisscuss","/del","/cha","/getAllUser","/gai","/exit","/toSetting","/AdminInfo","/toaddAdmin","/addAdmin","/toupdateAdmin","/updateAdmin","/towzsz","/togsjs","/tofwxy","/toyjsz","/todxsz");
    }
}
