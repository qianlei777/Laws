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
     * 添加目录
     * @param page
     * @return
     */
    @Override
    public Integer addPage(Page page) {
        Integer num = pageMapper.insertSelective(page);
        return num;
    }
}
