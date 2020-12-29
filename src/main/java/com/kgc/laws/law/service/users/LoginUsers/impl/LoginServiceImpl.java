package com.kgc.laws.law.service.users.LoginUsers.impl;

import com.kgc.laws.law.mapper.UsersMapper;
import com.kgc.laws.law.pojo.Users;
import com.kgc.laws.law.pojo.UsersExample;
import com.kgc.laws.law.service.users.LoginUsers.LoginService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class LoginServiceImpl implements LoginService {

    @Resource
    UsersMapper usersMapper;

    @Override
    public Users getUsers(String userphone, String password) {
        UsersExample example=new UsersExample();
        if (password!=null) {
            example.createCriteria().andPasswordEqualTo(password);
        }
        example.createCriteria().andUserphoneEqualTo(userphone);
        List<Users> users = usersMapper.selectByExample(example);
        if (users.size()>0) {
            return users.get(0);
        }
        return null;
    }

    @Override
    public Integer AddUsers(Users users) {
        return usersMapper.insertSelective(users);
    }

    @Override
    public int getUserByPhone(String phone) {
        UsersExample example=new UsersExample();
        example.createCriteria().andUserphoneEqualTo(phone);
        List<Users> usersList = usersMapper.selectByExample(example);
        if (usersList.size()>0){
            return 1;
        }
        return -1;
    }
}
