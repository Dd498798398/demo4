package com.example.demo.vo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author zhangxudong@chunyu.me
 * @date 2022/4/28 2:59 下午
 */
public class Test {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        User user = context.getBean("user", User.class);
        System.out.println(user);
        Object student = context.getBean("student", Student.class);
        System.out.println(student);
    }
}
