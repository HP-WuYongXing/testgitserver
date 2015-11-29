package com.yx.dao;

import com.yx.model.Hobby;

public interface HobbyMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Hobby record);

    int insertSelective(Hobby record);
}