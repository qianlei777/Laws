package com.kgc.laws.law.mapper;

import com.kgc.laws.law.pojo.Favorite;
import com.kgc.laws.law.pojo.FavoriteExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface FavoriteMapper {
    int countByExample(FavoriteExample example);

    int deleteByExample(FavoriteExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Favorite record);

    int insertSelective(Favorite record);

    List<Favorite> selectByExample(FavoriteExample example);

    Favorite selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Favorite record, @Param("example") FavoriteExample example);

    int updateByExample(@Param("record") Favorite record, @Param("example") FavoriteExample example);

    int updateByPrimaryKeySelective(Favorite record);

    int updateByPrimaryKey(Favorite record);
}