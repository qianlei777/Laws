package com.kgc.laws.law.service.addservice;

import com.kgc.laws.law.pojo.Admin;

public interface AdminoneService {
    //根据主键查询管理员
    Admin selectByPrimaryKey(Integer id);
    //根据对象主键修改管理员个人信息
    int updateByPrimaryKey(Admin record);
}
