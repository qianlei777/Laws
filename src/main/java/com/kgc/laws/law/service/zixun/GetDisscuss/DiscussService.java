package com.kgc.laws.law.service.zixun.GetDisscuss;

import com.github.pagehelper.PageInfo;
import com.kgc.laws.law.pojo.disscuss;

public interface DiscussService {
    PageInfo<disscuss> getAllDisscuss(String phone,String content,Integer pageNum,Integer pageSize);
    Integer delDisscussById(Integer id);
    disscuss getDisscussById(Integer id);
}
