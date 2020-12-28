package com.kgc.laws.law.controller.yaya;

import com.github.pagehelper.PageInfo;
import com.kgc.laws.law.pojo.disscuss;
import com.kgc.laws.law.service.zixun.GetDisscuss.DiscussService;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.websocket.server.PathParam;

@Controller
public class DisscussController {
    @Resource
    DiscussService discussService;

    @RequestMapping("getAllDisscuss")
    public String getAllDisscuss(String userphone, String content, Integer pageNum, Model model){
        if (pageNum==null){
            pageNum=1;
        }
        int pageSize=2;
        PageInfo<disscuss> allDisscuss = discussService.getAllDisscuss(userphone, content, pageNum, pageSize);
        model.addAttribute("allDisscuss",allDisscuss);
        model.addAttribute("userphone",userphone);
        model.addAttribute("content",content);
        return "disscuss";
    }

    @RequestMapping("/del")
    @ResponseBody
    public String deleteDisscussById(Integer id){
        String flag="false";
        Integer delDisscussById = discussService.delDisscussById(id);
        if (delDisscussById>0){
            flag="true";
        }
        return flag;
    }

    @RequestMapping("/cha")
    @ResponseBody
    public disscuss getDisscussById(Integer id){
        disscuss disscussById = discussService.getDisscussById(id);
        return disscussById;
    }
}
