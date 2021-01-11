package com.kgc.laws.law.service.addservice;

import com.kgc.laws.law.mapper.AdminMapper;
import com.kgc.laws.law.pojo.Admin;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class AdminoneServiceImpl implements AdminoneService {

    @Resource
    AdminMapper adminMapper;
    @Override
    public Admin selectByPrimaryKey(Integer id) {
        Admin admin = adminMapper.selectByPrimaryKey(id);
        return admin;
    }

    @Override
    public int updateByPrimaryKey(Admin record) {
        int i = adminMapper.updateByPrimaryKey(record);
        return i;
    }
}
