package com.kgc.laws.law.service.users.LoginUsers;

import com.kgc.laws.law.pojo.Users;

public interface LoginService {
    Users getUsers(String userphone,String password);
    Integer AddUsers(Users users);
    int getUserByPhone(String phone);
}
