package com.playwithspring.part2.chapter5.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class UserDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public void create(String name, String email) {
        jdbcTemplate.update("INSERT INTO user (name, email) VALUES(?,?)",
                new Object[] { name, email });

    }

    public List<User> selectAll() {
        return jdbcTemplate.query("select name , email from user",
                new UserRawMapper());
    }

}
