package com.springapp.mvc.mapper;

import com.springapp.mvc.entity.LeaveMsg;

public interface LeaveMsgMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(LeaveMsg record);

    int insertSelective(LeaveMsg record);

    LeaveMsg selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(LeaveMsg record);

    int updateByPrimaryKeyWithBLOBs(LeaveMsg record);

    int updateByPrimaryKey(LeaveMsg record);
}