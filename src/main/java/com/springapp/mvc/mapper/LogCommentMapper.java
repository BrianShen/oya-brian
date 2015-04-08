package com.springapp.mvc.mapper;

import com.springapp.mvc.entity.LogComment;

public interface LogCommentMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(LogComment record);

    int insertSelective(LogComment record);

    LogComment selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(LogComment record);

    int updateByPrimaryKeyWithBLOBs(LogComment record);

    int updateByPrimaryKey(LogComment record);
}