package com.kgc.laws.law.service.addservice;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.kgc.laws.law.mapper.LawsMapper;
import com.kgc.laws.law.pojo.Laws;
import com.kgc.laws.law.pojo.LawsExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class AddServiceImpl implements AddService {

    @Resource
    LawsMapper lawsMapper;

    //添加
    @Override
    public int insertSelective(Laws record) {
        int i = lawsMapper.insertSelective(record);
        return i;
    }

    //查询法则
    @Override
    public PageInfo<Laws> selectByExample(Integer PageNum, Integer PageSize, Integer lawsid, String lawsname) {

        PageHelper.startPage(PageNum,PageSize);
        LawsExample example=new LawsExample();
        if(lawsid!=null){
            example.createCriteria().andLawsidEqualTo(lawsid);
        }
        if(lawsname!=null&&!(lawsname.equals(""))){
            example.createCriteria().andLawsnameLike(lawsname);
        }
        List<Laws> law = lawsMapper.selectByExample(example);
        PageInfo<Laws> laws=new PageInfo<>(law);
        return laws;
    }

    //根据id查找
    @Override
    public Laws selectByPrimaryKey(Integer id) {
        Laws laws = lawsMapper.selectByPrimaryKey(id);
        return laws;

    }

    @Override
    public int updateByPrimaryKey(Laws record) {
        int i = lawsMapper.updateByPrimaryKey(record);
        return i;
    }
}
