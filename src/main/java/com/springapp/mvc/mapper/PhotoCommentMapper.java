package com.springapp.mvc.mapper;

import com.springapp.mvc.entity.PhotoComment;

public interface PhotoCommentMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(PhotoComment record);

    int insertSelective(PhotoComment record);

    PhotoComment selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(PhotoComment record);

    int updateByPrimaryKeyWithBLOBs(PhotoComment record);

    int updateByPrimaryKey(PhotoComment record);
}