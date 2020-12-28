package com.kgc.laws.law.service.qian.impl;

import com.kgc.laws.law.mapper.PageMapper;
import com.kgc.laws.law.pojo.Page;
import com.kgc.laws.law.pojo.PageExample;
import com.kgc.laws.law.service.djm.ClauseService;
import com.kgc.laws.law.service.qian.PageService;
import com.kgc.laws.law.utils.PageUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.print.attribute.standard.PageRanges;
import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;

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
        //查询所有的顶级目录  pageparent=0
        PageExample parent = new PageExample();
        if(lawsid!=null){
            parent.createCriteria().andLawsidEqualTo(lawsid);
        }
        //所有目录
        parent.setOrderByClause("pagesort");
        List<Page> allpages = pageMapper.selectByExample(parent);
        //子目录查询
        for (Page allPages : allpages) {
            allPages.setChildpage(PageUtils.getChild(allPages.getId(),allpages));
        }
        return allpages;
    }

    /**
     * 获取条款的父节点
     * @param id
     * @return
     */
    @Override
    public TreeMap<Integer, String> getParentName(Integer id) {

        Page page = pageMapper.selectByPrimaryKey(id);
        List<Page> allpages = pageMapper.selectByExample(null);
        TreeMap<Integer,String>treeMap = new TreeMap<>();
        TreeMap<Integer, String> parent = PageUtils.getParent(page.getPageparent(), allpages, treeMap);
        return parent;
    }
}
