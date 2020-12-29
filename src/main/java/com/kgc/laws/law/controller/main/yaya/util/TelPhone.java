package com.kgc.laws.law.controller.main.yaya.util;

import com.aliyuncs.CommonRequest;
import com.aliyuncs.CommonResponse;
import com.aliyuncs.DefaultAcsClient;
import com.aliyuncs.IAcsClient;
import com.aliyuncs.exceptions.ClientException;
import com.aliyuncs.exceptions.ServerException;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.profile.DefaultProfile;

public class TelPhone {



public static String telcode (String tel){
    DefaultProfile profile = DefaultProfile.getProfile("cn-hangzhou", "LTAI4G66uDQcPYVkyu4Z7tYH", "SFm71NwEQtWB2hJwn667Hy14pH8U02");
    IAcsClient client = new DefaultAcsClient(profile);
    String num=vcode();
    final  String defaultConnectTimeout  = "sun.net.client.defaultConnectTimeout";
    final  String defaultReadTimeout = "sun.net.client.defaultReadTimeout";
    final  String Timeout = "10000";
    CommonRequest request = new CommonRequest();
    request.setSysMethod(MethodType.POST);
    request.setSysDomain("dysmsapi.aliyuncs.com");
    request.setSysVersion("2017-05-25");
    request.setSysAction("SendSms");
    request.putQueryParameter("RegionId", "cn-hangzhou");
    request.putQueryParameter("PhoneNumbers", tel);
    request.putQueryParameter("SignName", "航多航空");
    request.putQueryParameter("TemplateCode", "SMS_205889713");
    request.putQueryParameter("TemplateParam", "{\"code\":"+num+"}");
    try {
        CommonResponse response = client.getCommonResponse(request);
        System.out.println(response.getData());
    } catch (ServerException e) {
        e.printStackTrace();
    } catch (ClientException e) {
        e.printStackTrace();
    }
    return num;
}

    /**
     * 生成6位随机数验证码
     * @return
     */
    public static String vcode(){
        String vcode = "";
        for (int i = 0; i < 6; i++) {
            vcode = vcode + (int)(Math.random() * 9);
        }
        return vcode;
    }


}
