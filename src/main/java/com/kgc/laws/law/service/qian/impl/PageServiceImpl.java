package com.kgc.laws.law.service.qian.impl;

import com.kgc.laws.law.mapper.PageMapper;
import com.kgc.laws.law.pojo.Page;
import com.kgc.laws.law.pojo.PageExample;
import com.kgc.laws.law.service.qian.PageService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author qianlei
 *
 */
@Service
public class PageServiceImpl implements PageService {
    @Resource
    PageMapper pageMapper;

    /**
     * 添加顶级目录
     * @param page
     * @return
     */
    @Override
    public Integer addFirstPage(Page page) {
        Integer num = pageMapper.insertSelective(page);
        return num;
    }

    /**
     * 目录总数
     * @return
     */
    @Override
    public Integer PageCount() {
        Integer pageCount = pageMapper.countByExample(null);
        return pageCount;
    }

    /**
     * 根据主键查询Page
     * @param id
     * @return
     */
    @Override
    public Page getPage(Integer id) {
        Page page = pageMapper.selectByPrimaryKey(id);
        return page;
    }

    /**
     * 根据主键ID更改目录
     * @param page
     * @return
     */
    @Override
    public Integer updatePage(Page page) {
        int i = pageMapper.updateByPrimaryKeySelective(page);
        return i;
    }
}
