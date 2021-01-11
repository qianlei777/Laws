package com.kgc.laws.law.service.djm;

import com.github.pagehelper.PageInfo;
import com.kgc.laws.law.pojo.Admin;

/**
 * @author shkstart
 * @create 2020-12-28 19:17
 */
public interface AdminService {

    //分页 模糊查找用户
    PageInfo<Admin> getAdminInfo(Integer pageNum,Integer pageSize,String phone,String name);
}
