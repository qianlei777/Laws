package com.kgc.laws.law.service.zixun.GetDisscuss;

import com.github.pagehelper.PageInfo;
import com.kgc.laws.law.pojo.Disscuss;

public interface DiscussService {
    PageInfo<Disscuss> getAllDisscuss(String phone, String content, Integer pageNum, Integer pageSize);
    Integer delDisscussById(Integer id);
    Disscuss getDisscussById(Integer id);
}
