package com.springapp.mvc.controller;

import com.springapp.mvc.entity.Result;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.Map;

/**
 * Created by Administrator on 2015/4/10.
 */
@Controller
@RequestMapping("/login")
public class LoginController {



    @RequestMapping(value = "/info",method = RequestMethod.POST)
    public ModelAndView getLogin(@RequestParam("username") String username,@RequestParam("p")String md5Pw) {
        ModelAndView modelAndView = new ModelAndView("hello");
        System.out.print(username +" "+ md5Pw);
        return modelAndView;


    }
}
