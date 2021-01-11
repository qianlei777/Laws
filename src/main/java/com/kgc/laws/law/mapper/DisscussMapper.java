package com.kgc.laws.law.mapper;

import com.kgc.laws.law.pojo.Disscuss;
import com.kgc.laws.law.pojo.DisscussExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author shkstart
 * @create 2021-01-11 14:45
 */
public interface DisscussMapper {
    int countByExample(DisscussExample example);

    int deleteByExample(DisscussExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Disscuss record);

    int insertSelective(Disscuss record);

    List<Disscuss> selectByExample(DisscussExample example);

    Disscuss selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Disscuss record, @Param("example") DisscussExample example);

    int updateByExample(@Param("record") Disscuss record, @Param("example") DisscussExample example);

    int updateByPrimaryKeySelective(Disscuss record);

    int updateByPrimaryKey(Disscuss record);
}
