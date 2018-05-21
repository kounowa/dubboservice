package com.xyf.service;
import com.xyf.ifac.user;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Consumer {
    public static void main(String[] args) throws Exception {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                new String[]{"dubbo-consumer.xml"});
        context.start();
        user userService = (user) context.getBean("userService");
        userService.add(1);
    }
}