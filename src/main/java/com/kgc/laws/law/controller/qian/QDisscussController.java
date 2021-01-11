package com.kgc.laws.law.controller.qian;

import com.kgc.laws.law.pojo.Disscuss;
import com.kgc.laws.law.service.zixun.GetDisscuss.DiscussService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class QDisscussController {
    @Autowired
    DiscussService discussService;
    @RequestMapping("addDisscuss")
    @ResponseBody
    public String addDisscuss(Disscuss disscuss){
        Integer num = discussService.addDisscuss(disscuss);
        if(num>0){
            return  "<script>alert('提交成功，我们将会尽快联系您的手机，亲注意查收');location.href='main'</script>";
        }
        return "";
    }
}
