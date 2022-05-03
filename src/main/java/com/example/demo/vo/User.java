package com.example.demo.vo;

import org.springframework.stereotype.Component;

/**
 * @author zhangxudong@chunyu.me
 * @date 2022/4/27 7:37 下午
 */
@Component
public class User {

    public User() {
        System.out.println("User()");
        System.out.println("123");
    }

    private Student student;

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }
}
