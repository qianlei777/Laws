package com.kgc.laws.law.service.djm;

import com.kgc.laws.law.mapper.LawsMapper;
import com.kgc.laws.law.pojo.Laws;
import com.kgc.laws.law.service.djm.LawsService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author shkstart
 * @create 2020-12-23 17:16
 */
@Service
public class LawsServiceImpl implements LawsService {
    @Resource
    LawsMapper lawsMapper;
    @Override
    public List<Laws> getLawsAll() {
        return lawsMapper.selectByExample(null);
    }
}
