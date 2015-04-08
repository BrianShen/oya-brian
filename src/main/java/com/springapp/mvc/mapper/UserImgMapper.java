package com.springapp.mvc.mapper;

import com.springapp.mvc.entity.UserImg;

public interface UserImgMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(UserImg record);

    int insertSelective(UserImg record);

    UserImg selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(UserImg record);

    int updateByPrimaryKey(UserImg record);
}