package com.wcl;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.wcl.service.HelloWorldService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext.xml")
public class TransactionTest {
    
    @Autowired 
    HelloWorldService helloService;
    
    @Test
    public void test(){
        helloService.addUserAndArticle();
    }
}
