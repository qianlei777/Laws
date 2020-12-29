package com.kgc.laws.law.service.users.GetUsers.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.kgc.laws.law.mapper.AdminMapper;
import com.kgc.laws.law.mapper.UsersMapper;
import com.kgc.laws.law.pojo.Admin;
import com.kgc.laws.law.pojo.AdminExample;
import com.kgc.laws.law.pojo.Users;
import com.kgc.laws.law.pojo.UsersExample;
import com.kgc.laws.law.service.users.GetUsers.UsersService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UsersServiceImpl implements UsersService {

    @Resource
    UsersMapper usersMapper;
    @Resource
    AdminMapper adminMapper;

    @Override
    public PageInfo<Users> getAllUsers(String phone, int pageNum, int pageSize) {
        PageHelper.startPage(pageNum,pageSize);
        UsersExample example=new UsersExample();
        if (phone!=null&&!phone.equals("")){
            phone="%"+phone+"%";
            example.createCriteria().andUserphoneLike(phone);
        }
        List<Users> usersList=usersMapper.selectByExample(example);
        PageInfo<Users> usersPageInfo=new PageInfo<>(usersList);
        return usersPageInfo;
    }

    @Override
    public int updateUsers(Users users) {
        return usersMapper.updateByPrimaryKeySelective(users);
    }

    @Override
    public Admin getAdmin(String phone, String password) {
        AdminExample example=new AdminExample();
        example.createCriteria().andPhoneEqualTo(phone).andPasswordEqualTo(password);
        List<Admin> admins = adminMapper.selectByExample(example);
        if (admins.size()>0){
            return admins.get(0);
        }
        return null;
    }
}
