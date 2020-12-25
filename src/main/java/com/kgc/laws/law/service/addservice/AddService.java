package com.kgc.laws.law.service.addservice;

import com.github.pagehelper.PageInfo;
import com.kgc.laws.law.pojo.Laws;
import com.kgc.laws.law.pojo.LawsExample;

import java.util.List;

public interface AddService {
    //添加法则方法
    int insertSelective(Laws record);
    //查看法则方法
    PageInfo<Laws> selectByExample(Integer PageNum,Integer PageSize,Integer name,String ming);
    //根据id查询法则
    Laws selectByPrimaryKey(Integer id);
    //根据主键修改
    int updateByPrimaryKey(Laws record);

}
