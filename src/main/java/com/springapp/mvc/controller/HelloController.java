package com.springapp.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/pages")
public class HelloController {
	@RequestMapping(value = "/hi",method = RequestMethod.GET)
	public ModelAndView printWelcome(@RequestParam("name")String name,@RequestParam("englishName")String englishName) {
        ModelAndView mv = new ModelAndView("hello");
        mv.addObject("name",name);
        mv.addObject("englishName",englishName);
		return mv;
	}
    
    @RequestMapping(value = "/{page}")
    public ModelAndView getPage(@PathVariable("page")String page) {
        ModelAndView mav = new ModelAndView(page);
        return mav;
    }
    
    
    
    
}