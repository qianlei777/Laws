package com.kgc.laws.law.service.zixun.GetDisscuss.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.kgc.laws.law.mapper.DisscussMapper;
import com.kgc.laws.law.mapper.DisscussMapper;
import com.kgc.laws.law.pojo.Disscuss;
import com.kgc.laws.law.pojo.DisscussExample;
import com.kgc.laws.law.service.zixun.GetDisscuss.DiscussService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class DisscussServiceImpl implements DiscussService {

    @Resource
    DisscussMapper disscussMapper;
    @Override
    public PageInfo<Disscuss> getAllDisscuss(String phone, String content, Integer pageNum, Integer pageSize) {
        DisscussExample example=new DisscussExample();
        DisscussExample example1=new DisscussExample();
        PageHelper.startPage(pageNum,pageSize);
        PageHelper.orderBy("consulttime desc");
        if (phone!=null&&content==""){
            phone="%"+phone+"%";
            example.createCriteria().andUserphoneLike(phone);
        }else if (content!=null&&phone==""){
            content="%"+content+"%";
            example.createCriteria().andContentLike(content);
        }else if (phone!=null&&content!=null){
            content="%"+content+"%";
            phone="%"+phone+"%";
            example.createCriteria().andUserphoneLike(phone);
            DisscussExample.Criteria criteria = example1.createCriteria().andContentLike(content);
            example.or(criteria);
        }
        List<Disscuss> DisscussList=disscussMapper.selectByExample(example);
        PageInfo<Disscuss> DisscussPageInfo=new PageInfo<>(DisscussList);
        return DisscussPageInfo;
    }

    @Override
    public Integer delDisscussById(Integer id) {
        return disscussMapper.deleteByPrimaryKey(id);
    }

    @Override
    public Disscuss getDisscussById(Integer id) {
        Disscuss Disscuss = disscussMapper.selectByPrimaryKey(id);
        return Disscuss;
    }
}
