package com.kgc.laws.law.mapper;

import com.kgc.laws.law.pojo.Laws;
import com.kgc.laws.law.pojo.LawsExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface LawsMapper {
    int countByExample(LawsExample example);

    int deleteByExample(LawsExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Laws record);

    int insertSelective(Laws record);

    List<Laws> selectByExample(LawsExample example);

    Laws selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Laws record, @Param("example") LawsExample example);

    int updateByExample(@Param("record") Laws record, @Param("example") LawsExample example);

    int updateByPrimaryKeySelective(Laws record);

    int updateByPrimaryKey(Laws record);
    Laws selectByLawsid(Integer lawid);
}