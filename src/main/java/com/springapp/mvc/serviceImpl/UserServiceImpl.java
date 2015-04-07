package com.springapp.mvc.serviceImpl;

import com.springapp.mvc.entity.User;
import com.springapp.mvc.mapper.UserMapper;
import com.springapp.mvc.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

/**
 * author: brian.shen  brian.shen@dianping.com
 * description:
 * date: 2015/4/3  18:55
 */
@Service
@Scope("singleton")
public class UserServiceImpl implements UserService{
    @Autowired
    private UserMapper userMapper;
    @Override
    public User findUserByName(String name) {
        
        return null;
    }

    @Override
    public User findUserByNickName(String nickName) {
        return null;
    }

    @Override
    public User findUserById(Integer id) {
        User user = userMapper.selectByPrimaryKey(id);
        return user;
    }
}
