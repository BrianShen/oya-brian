package com.springapp.mvc.controller;

import com.springapp.mvc.entity.Result;
import com.springapp.mvc.entity.User;
import com.springapp.mvc.serviceImpl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Objects;

/**
 * author: brian.shen  brian.shen@dianping.com
 * description:
 * date: 2015/4/3  19:27
 */
@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserServiceImpl userService;
    
    @RequestMapping("/id/{id}")
    @ResponseBody
    public Result<Object> getUser(@PathVariable("id")Integer id) {

        Result<Object> result = new Result<Object>();
        try {
            User user=userService.findUserById(id);
System.out.println(user);

            result.setResult(user);
            result.setIsSuccess(true);
            return result;
        }catch (Exception e) {
            e.printStackTrace();
        }
        
        return result;
        
    }
}
