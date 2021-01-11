package com.kgc.laws.law.service.qian.impl;

import com.kgc.laws.law.mapper.FavoriteMapper;
import com.kgc.laws.law.pojo.Favorite;
import com.kgc.laws.law.pojo.FavoriteExample;
import com.kgc.laws.law.service.qian.FavoriteService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
public class FavoriteServiceImpl implements FavoriteService{
    @Resource
    FavoriteMapper favoriteMapper;

    /**
     * 查看所有收藏
     * @param id
     * @return
     */
    @Override
    public List<Favorite> getAllFavorite(Integer id) {
        FavoriteExample example = new FavoriteExample();
        example.createCriteria().andUidEqualTo(id);
        List<Favorite> favorites = favoriteMapper.selectByExample(example);
        return favorites;
    }

    @Override
    public int addFavorite(Favorite favorite) {
        return favoriteMapper.insertSelective(favorite);
    }
}
