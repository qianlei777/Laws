package com.kgc.laws.law.service.qian;

import com.kgc.laws.law.pojo.Page;

public interface PageService {
    Integer addFirstPage(Page page);
    Integer PageCount();
    Page getPage(Integer id);
    Integer updatePage(Page page);
}
