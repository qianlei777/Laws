package com.kgc.laws.law.mapper;

import com.kgc.laws.law.pojo.Clause;
import com.kgc.laws.law.pojo.ClauseExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ClauseMapper {
    int countByExample(ClauseExample example);

    int deleteByExample(ClauseExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Clause record);

    int insertSelective(Clause record);

    List<Clause> selectByExample(ClauseExample example);

    Clause selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Clause record, @Param("example") ClauseExample example);

    int updateByExample(@Param("record") Clause record, @Param("example") ClauseExample example);

    int updateByPrimaryKeySelective(Clause record);

    int updateByPrimaryKey(Clause record);

    List<Clause>getClauseByPageId(Integer id);
}