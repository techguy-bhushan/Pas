package com.playwithspring.part2.chapter5.jdbc;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.lang.Nullable;

import java.sql.ResultSet;
import java.sql.SQLException;

public class UserResultSetExtractor implements ResultSetExtractor {
    @Nullable
    @Override
    public User extractData(ResultSet resultSet) throws SQLException, DataAccessException {
        User user = new User();
        user.setName(resultSet.getString(1));
        user.setEmail(resultSet.getString(2));
        return user;
    }
}
