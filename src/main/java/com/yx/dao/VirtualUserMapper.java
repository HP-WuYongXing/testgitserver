package com.yx.dao;

import com.yx.model.VirtualUser;

public interface VirtualUserMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(VirtualUser record);

    int insertSelective(VirtualUser record);

    VirtualUser selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(VirtualUser record);

    int updateByPrimaryKey(VirtualUser record);
}