package com.yx.dao;

import com.yx.model.FilePermission;

public interface FilePermissionMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(FilePermission record);

    int insertSelective(FilePermission record);

    FilePermission selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(FilePermission record);

    int updateByPrimaryKey(FilePermission record);
}