package com.springapp.mvc.mapper;

import com.springapp.mvc.entity.Saying;

public interface SayingMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Saying record);

    int insertSelective(Saying record);

    Saying selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Saying record);

    int updateByPrimaryKeyWithBLOBs(Saying record);

    int updateByPrimaryKey(Saying record);
}