package com.example.demo.vo;

import org.springframework.stereotype.Component;

/**
 * @author zhangxudong@chunyu.me
 * @date 2022/4/27 7:37 下午
 */
@Component
public class Student {

    public Student() {
        System.out.println("Student()");
    }

    private User user;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

}
