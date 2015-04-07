package com.springapp.mvc;

import com.springapp.mvc.entity.User;
import com.springapp.mvc.serviceImpl.UserServiceImpl;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * author: brian.shen  brian.shen@dianping.com
 * description:
 * date: 2015/4/7  10:52
 */
public class UserServiceTest {
    
    private ApplicationContext ac;
    private UserServiceImpl userService;
    @Before
    public void setUp() {
        ac = new ClassPathXmlApplicationContext(new String[] {"applicationContext.xml", "mvc-dispatcher-servlet.xml"});
        userService = (UserServiceImpl) ac.getBean("userServiceImpl");
        
    }
    @Test
    public void testFindUserById() {
        Integer id = 1;
        User user = userService.findUserById(id);
        System.out.println(user);
    }
    
}
