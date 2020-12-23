package com.kgc.laws.law.service;

import com.github.pagehelper.PageInfo;
import com.kgc.laws.law.pojo.Clause;

/**
 * @author shkstart
 * @create 2020-12-23 15:34
 */
public interface ClauseService {
    //查看所有条款  根据法规部号 或者 条款号 或者 关键字
        //法规部号lawsid   条款号 clauseid
        //关键子 concat查询
    PageInfo<Clause> selectAllBy(Integer pageNum,Integer pageSize,Integer lawsid,String clauseid,String like);

}
