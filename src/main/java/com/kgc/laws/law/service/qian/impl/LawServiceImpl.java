package com.kgc.laws.law.service.qian.impl;

import com.kgc.laws.law.mapper.LawsMapper;
import com.kgc.laws.law.pojo.Laws;
import com.kgc.laws.law.service.qian.LawService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
public class LawServiceImpl implements LawService {
    @Resource
    LawsMapper lawsMapper;

    /**
     * 全部法规
     * @return
     */
    @Override
    public List<Laws> getAllLaw() {
        List<Laws> laws = lawsMapper.selectByExample(null);
        return laws;
    }
}
