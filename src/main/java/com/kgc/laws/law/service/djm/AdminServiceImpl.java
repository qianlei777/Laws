package com.kgc.laws.law.service.djm;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.kgc.laws.law.mapper.AdminMapper;
import com.kgc.laws.law.pojo.Admin;
import com.kgc.laws.law.pojo.AdminExample;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author shkstart
 * @create 2020-12-28 19:19
 */
@Service
public class AdminServiceImpl implements AdminService {

    @Resource
    AdminMapper adminMapper;

    @Override
    public PageInfo<Admin> getAdminInfo(Integer pageNum, Integer pageSize, String phone, String name) {
        PageHelper.startPage(pageNum,pageSize);
        AdminExample example = new AdminExample();
        if(phone!=null&&!(phone.equals(" "))){
            example.createCriteria().andPhoneLike("%"+phone+"%");
        }
        if(name!=null&&!(name.equals(" "))){
            example.createCriteria().andAnameLike("%"+name+"%");
        }

        PageInfo<Admin> pageInfo = new PageInfo<>(adminMapper.selectByExample(example));

        return pageInfo;
    }
}
