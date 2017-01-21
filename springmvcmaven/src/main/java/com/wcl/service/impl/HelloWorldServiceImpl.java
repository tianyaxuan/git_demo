package com.wcl.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wcl.bean.Article;
import com.wcl.bean.User;
import com.wcl.dao.ArticleMapper;
import com.wcl.dao.UserMapper;
import com.wcl.service.HelloWorldService;

@Service
public class HelloWorldServiceImpl implements HelloWorldService {
    @Autowired
    private UserMapper userMapper;

    @Autowired
    private ArticleMapper articleMapper;

    public String getNewName(String userName) {
        return "hello spring!" + userName;
    }

    public void addUserAndArticle() {
        User user = new User();
        
        user.setUseraddress("1111");
        user.setUserage(12);
        user.setUsername("nihao");
        userMapper.insert(user);
        Article article = new Article();
        article.setTitle("11");
        article.setUserid(2);
        article.setContent("111");
        articleMapper.insert(article);
    }
}
