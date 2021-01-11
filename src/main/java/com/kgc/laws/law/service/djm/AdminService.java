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

    //添加用户
    int insertAdmin(Admin admin);

    //根据主键 查找管理员
    Admin getAdminById(Integer id);

    //修改管理员信息
    int updateAdmin(Admin admin);

    //根据手机号 查找是否存在
    boolean existsPhone(String phone);
}
