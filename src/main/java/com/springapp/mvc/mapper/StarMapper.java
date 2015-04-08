package com.springapp.mvc.mapper;

import com.springapp.mvc.entity.Star;

public interface StarMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Star record);

    int insertSelective(Star record);

    Star selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Star record);

    int updateByPrimaryKey(Star record);
}