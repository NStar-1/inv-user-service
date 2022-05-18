package com.user.userService.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.user.userService.entity.applicationEntity;

import org.springframework.jdbc.core.RowMapper;

public class ApplicationRowMapper implements RowMapper<applicationEntity> {

    @Override
    public applicationEntity mapRow(ResultSet rs, int arg1) throws SQLException {
        applicationEntity app = new applicationEntity();
        app.setId(rs.getInt("id"));
        app.setAppVersion(rs.getString("app_version"));
        app.setDataRelease(rs.getString("data_release"));

        return app;
    }

}
