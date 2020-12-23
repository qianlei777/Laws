package com.kgc.laws.law.service;

import com.kgc.laws.law.pojo.Laws;

import java.util.List;

/**
 * @author shkstart
 * @create 2020-12-23 17:15
 */
public interface LawsService  {
    //查询所有 法规
    List<Laws> getLawsAll();
}
