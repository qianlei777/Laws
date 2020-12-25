package com.kgc.laws.law.service.zixun.GetDisscuss.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.kgc.laws.law.mapper.disscussMapper;
import com.kgc.laws.law.pojo.disscuss;
import com.kgc.laws.law.pojo.disscussExample;
import com.kgc.laws.law.service.zixun.GetDisscuss.DiscussService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class DisscussServiceImpl implements DiscussService {

    @Resource
    disscussMapper disscussMapper;
    @Override
    public PageInfo<disscuss> getAllDisscuss(String phone, String content, Integer pageNum, Integer pageSize) {
        disscussExample example=new disscussExample();
        disscussExample example1=new disscussExample();
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
            disscussExample.Criteria criteria = example1.createCriteria().andContentLike(content);
            example.or(criteria);
        }
        List<disscuss> disscussList=disscussMapper.selectByExample(example);
        PageInfo<disscuss> disscussPageInfo=new PageInfo<>(disscussList);
        return disscussPageInfo;
    }

    @Override
    public Integer delDisscussById(Integer id) {
        return disscussMapper.deleteByPrimaryKey(id);
    }

    @Override
    public disscuss getDisscussById(Integer id) {
        disscuss disscuss = disscussMapper.selectByPrimaryKey(id);
        return disscuss;
    }
}
