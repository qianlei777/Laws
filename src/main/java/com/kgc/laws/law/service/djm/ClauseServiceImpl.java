package com.kgc.laws.law.service.djm;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.kgc.laws.law.mapper.ClauseMapper;
import com.kgc.laws.law.pojo.Clause;
import com.kgc.laws.law.pojo.ClauseExample;
import com.kgc.laws.law.service.djm.ClauseService;
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


        if (lawsid != null && lawsid != 0) {
            example.createCriteria().andLawidEqualTo(lawsid);
        }
        if (clauseid != null && (!(clauseid.equals("")))) {
            example.createCriteria().andClauseidEqualTo(clauseid);
        }
        if (like != null && !(like.equals(""))) {
            example.createCriteria().andKeywordLike("%" + like + "%");
        }
        List<Clause> clauses = clauseMapper.selectByExample(example);
        PageInfo<Clause> pageInfo = new PageInfo<>(clauses);

        return pageInfo;
    }

    @Override
    public int insertClause(Clause clause) {

        return clauseMapper.insertSelective(clause);
    }

    @Override
    public int updateById(Integer id) {
        Clause clause = new Clause();
        clause.setId(id);
        return clauseMapper.updateByPrimaryKeySelective(clause);
    }

    @Override
    public Clause getClauseById(Integer id) {

        return clauseMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updataClauseByClause(Clause clause) {
        return clauseMapper.updateByPrimaryKeySelective(clause);
    }

}
