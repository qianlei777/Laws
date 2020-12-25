package com.kgc.laws.law.service.qian.impl;

import com.kgc.laws.law.mapper.PageMapper;
import com.kgc.laws.law.pojo.Page;
import com.kgc.laws.law.pojo.PageExample;
import com.kgc.laws.law.service.qian.PageService;
import com.kgc.laws.law.utils.PageUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.print.attribute.standard.PageRanges;
import java.util.ArrayList;
import java.util.List;

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

    /**
     * 查询所有目录及子目录
     * @param lawsid
     * @return
     */
    @Override
    public List<Page> getAllPage(Integer lawsid) {
        //所有目录
        List<Page> allpages = pageMapper.selectByExample(null);
        //查询所有的顶级目录  pageparent=0
        PageExample parent = new PageExample();
        parent.createCriteria().andPageparentEqualTo(0);
        if(lawsid!=null){
            parent.createCriteria().andLawsidEqualTo(lawsid);
        }
        parent.setOrderByClause("pagesort");
        List<Page> parentList = pageMapper.selectByExample(parent);
        //子目录查询
        List<Page>childList = new ArrayList<>();
        for (Page parentPage : parentList) {
            parentPage.setChildpage(PageUtils.getChild(parentPage.getId(),allpages));
        }
        return parentList;
    }
}
