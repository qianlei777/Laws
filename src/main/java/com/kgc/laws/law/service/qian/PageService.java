package com.kgc.laws.law.service.qian;

import com.kgc.laws.law.pojo.Page;

import java.util.List;
import java.util.TreeMap;

public interface PageService {
    Integer addFirstPage(Page page);
    Integer PageCount();
    Page getPage(Integer id);
    Integer updatePage(Page page);
    List<Page>getAllPage(Integer lawsid);
    TreeMap<Integer,String>getParentName(Integer id);
}
