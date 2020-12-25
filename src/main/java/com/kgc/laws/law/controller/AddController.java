package com.kgc.laws.law.controller;

import com.github.pagehelper.PageInfo;
import com.kgc.laws.law.pojo.Laws;
import com.kgc.laws.law.service.addservice.AddService;

import org.apache.commons.io.FilenameUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpSession;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Random;

@Controller
public class AddController {

    @Autowired
    AddService addService;

    @RequestMapping("add")
    public String addtext(){
        return "f-laws-add";
    }


//    @RequestMapping("addlaw")
//    public String addtext01(Laws laws, @RequestParam("lawspicture")MultipartFile idPic, Model model, HttpSession session){
//        System.out.println(laws.getLawspicture()+laws.getLawsname());
//        //获取文件上传路径
//        String realPath=session.getServletContext().getRealPath("images/uploadfiles/");
//        //原文件名
//        String oldName=idPic.getOriginalFilename();
//        //扩展名
//        String extension= FilenameUtils.getExtension(oldName);
//        //获取文件名（生成一个新的文件名）
//        String newName=System.currentTimeMillis()+new Random().nextInt(1000)+"_id_pic."+extension;
//        System.out.println(newName);
//        //封装File对象
//        File file=new File(realPath,newName);
//        try {
//            idPic.transferTo(file);
//            model.addAttribute("id_pic",newName);
//            model.addAttribute("msg","文件上传成功");
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//
//        return "show";
//    }

    //添加法规
    @RequestMapping("addlaw")
    public String addtext01(@RequestParam("ip_pic")MultipartFile idPic,Laws laws, Model model, HttpSession session){
        // 获取文件上传路径
        String realPath=session.getServletContext().getRealPath("/images/uploadfiles/");
        //判断该路径是否存在，不存在则创建
        File file1=new File(realPath);
        if(!file1.exists()){
            file1.mkdir();
        }
        //原文件名
        String oldName=idPic.getOriginalFilename();
        System.out.println(oldName);

        //扩展名
        String extension= FilenameUtils.getExtension(oldName);
        //获取文件名（生成一个新的文件名）
        String newName=System.currentTimeMillis()+new Random().nextInt(1000)+"_id_pic."+extension;
        System.out.println(newName);
        //封装File对象
        File file=new File(realPath,newName);
        try {
            try {
                idPic.transferTo(file);
            } catch (IOException e) {
                e.printStackTrace();
            }
            model.addAttribute("id_pic",newName);
            model.addAttribute("msg","文件上传成功");
        } catch (Exception e) {
            e.printStackTrace();
        }
        laws.setLawspicture(oldName);
        int i = addService.insertSelective(laws);
        if(i>0){
            return "redirect:showall";

        }else {
            return "f-laws-add";
        }
    }

    //查看法规列表
    @RequestMapping("showall")
    public String addtext02(Integer PageNum,Integer lawsid,String lawsname, Model model){
        if(PageNum==null) {
            PageNum = 1;
        }
        Integer PageSize=2;
        PageInfo<Laws> lawsPageInfo = addService.selectByExample(PageNum, PageSize, lawsid, lawsname);
        if(lawsPageInfo.getList().size()<1){
            model.addAttribute("msg","不存在您查找的法规信息");
        }
        model.addAttribute("law",lawsPageInfo);
        model.addAttribute("lawsid",lawsid);
        model.addAttribute("lawsname",lawsname);
        return "f-laws-show";
    }

    //修改回显方法
    @RequestMapping("update")
    public String addtext03(Integer id, Model model){
        Laws laws = addService.selectByPrimaryKey(id);
        model.addAttribute("la",laws);
        return "f-laws-update";
    }


    //修改回显方法
    @RequestMapping("addupdate")
    public String addtext04(Laws laws, Model model){
        System.out.println(laws.getId());
        int i = addService.updateByPrimaryKey(laws);

        return "redirect:showall";
    }
}
