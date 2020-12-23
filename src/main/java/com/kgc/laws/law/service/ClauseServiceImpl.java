package com.kgc.laws.law.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.kgc.laws.law.mapper.ClauseMapper;
import com.kgc.laws.law.pojo.Clause;
import com.kgc.laws.law.pojo.ClauseExample;
import com.sun.glass.ui.Size;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author shkstart
 * @create 2020-12-23 16:17
 */
@Service
public class ClauseServiceImpl implements ClauseService {
    @Resource
    ClauseMapper clauseMapper;

    @Override
    public PageInfo<Clause> selectAllBy(Integer pageNum, Integer pageSize, Integer lawsid, String clauseid, String like) {
        PageHelper.startPage(pageNum, pageSize);
        ClauseExample example = new ClauseExample();


        if (lawsid!=null&&lawsid != 0) {
            example.createCriteria().andLawidEqualTo(lawsid);
        }
        if (clauseid != null && (!(clauseid.equals("")))) {
            example.createCriteria().andClauseidEqualTo(clauseid);
        }
        if (like != null && !(like.equals(""))) {
            example.or().andTitleLike("%" + like + "%");
            example.or().andCcontentLike("%" + like + "%");

        }
        List<Clause> clauses = clauseMapper.selectByExample(example);
        PageInfo<Clause> pageInfo = new PageInfo<>(clauses);

        return pageInfo;
    }
}
