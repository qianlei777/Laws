package com.kgc.laws.law.mapper;

import com.kgc.laws.law.pojo.disscuss;
import com.kgc.laws.law.pojo.disscussExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface disscussMapper {
    int countByExample(disscussExample example);

    int deleteByExample(disscussExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(disscuss record);

    int insertSelective(disscuss record);

    List<disscuss> selectByExample(disscussExample example);

    disscuss selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") disscuss record, @Param("example") disscussExample example);

    int updateByExample(@Param("record") disscuss record, @Param("example") disscussExample example);

    int updateByPrimaryKeySelective(disscuss record);

    int updateByPrimaryKey(disscuss record);
}