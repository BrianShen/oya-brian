package com.springapp.mvc.mapper;

import com.springapp.mvc.entity.PhotoSet;

public interface PhotoSetMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(PhotoSet record);

    int insertSelective(PhotoSet record);

    PhotoSet selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(PhotoSet record);

    int updateByPrimaryKey(PhotoSet record);
}