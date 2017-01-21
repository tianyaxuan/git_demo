package com.wcl.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import com.wcl.bean.User;
import com.wcl.dao.UserMapper;

@Controller
@RequestMapping("/article")
public class UserController {
    @Autowired
    UserMapper userMapper;

    @RequestMapping("/list")
    public String listall(HttpServletRequest request,HttpServletResponse response){
        User articles=userMapper.selectByPrimaryKey(1); 
        ModelAndView mav=new ModelAndView("list");
        mav.addObject("articles",articles);
        return "hello";
    }
}