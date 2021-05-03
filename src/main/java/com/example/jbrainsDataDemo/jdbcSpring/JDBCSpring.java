package com.example.jbrainsDataDemo.jdbcSpring;

import com.example.jbrainsDataDemo.jdbcSpring.model.Circle;
import com.example.jbrainsDataDemo.jdbcSpring.dao.JDBCDaoSpring;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class JDBCSpring {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("springJdbc.xml");

        JDBCDaoSpring dao = context.getBean("JDBCDaoSpring", JDBCDaoSpring.class);
        Circle circle = dao.getCircle(1);
        System.out.println(circle.getName());
        System.out.println(dao.getCircleCount());
    }
}
