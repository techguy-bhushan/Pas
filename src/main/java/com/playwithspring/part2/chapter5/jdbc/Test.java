package com.playwithspring.part2.chapter5.jdbc;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        UserDao userDao = context.getBean("userDao", UserDao.class);
        userDao.create("John Doe", "jhondoe@gmail.com");
        userDao.create("Rock Doe", "rockdoe@gmail.com");

        System.out.println(userDao.selectAll());
    }
}
