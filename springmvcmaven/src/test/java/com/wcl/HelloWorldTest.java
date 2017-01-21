package com.wcl;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloWorldTest {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext(
                "SpringBeans.xml");
 
        
    }
}