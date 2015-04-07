package com.springapp.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * author: brian.shen  brian.shen@dianping.com
 * description:
 * date: 2015/4/7  14:34
 */
@Controller
@RequestMapping("page")
public class ViewController {

    @RequestMapping(value = "/{page}")
    public ModelAndView getPage(@PathVariable("page")String page) {
        ModelAndView mav = new ModelAndView(page);
        return mav;
    }
    
    
}
