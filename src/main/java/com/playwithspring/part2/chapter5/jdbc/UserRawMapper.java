package com.playwithspring.part2.chapter5.jdbc;


import org.springframework.jdbc.core.RowMapper;
import org.springframework.lang.Nullable;

import java.sql.ResultSet;
import java.sql.SQLException;

public class UserRawMapper implements RowMapper<User> {
    @Nullable
    @Override
    public User mapRow(ResultSet resultSet, int i) throws SQLException {
        UserResultSetExtractor extractor = new UserResultSetExtractor();
        return extractor.extractData(resultSet);
    }
}
