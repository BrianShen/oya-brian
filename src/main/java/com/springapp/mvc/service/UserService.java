package com.springapp.mvc.service;

import com.springapp.mvc.entity.User;

/**
 * author: brian.shen  brian.shen@dianping.com
 * description:
 * date: 2015/4/3  18:53
 */
public interface UserService {
    public User findUserByName(String name);
    public User findUserByNickName(String nickName);
    public User findUserById(Integer id);
}
