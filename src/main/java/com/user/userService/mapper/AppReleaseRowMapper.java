package com.user.userService.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.user.userService.entity.Application;

import org.springframework.jdbc.core.RowMapper;

public class AppReleaseRowMapper implements RowMapper<Application> {

    @Override
    public Application mapRow(ResultSet rs, int arg1) throws SQLException {
        Application app = new Application();
        app.setAppReleaseId(rs.getString("app_id"));
        app.setAppReleaseAppVersion(rs.getString("app_version"));
        app.setAppReleaseDataRelease(rs.getString("data_release"));

        return app;
    }

}
