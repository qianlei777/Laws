package com.kgc.laws.law.service.users.GetUsers;

import com.github.pagehelper.PageInfo;
import com.kgc.laws.law.pojo.Users;

public interface UsersService {
    PageInfo<Users> getAllUsers(String phone,int pageNum,int pageSize);//用户显示，分页，模糊查询
    int updateUsers(Users users);
}
