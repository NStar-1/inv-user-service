package com.user.userService.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.user.userService.entity.AppRelease;

import org.springframework.jdbc.core.RowMapper;

public class AppReleaseRowMapper implements RowMapper<AppRelease> {

    @Override
    public AppRelease mapRow(ResultSet rs, int arg1) throws SQLException {
        AppRelease app = new AppRelease();
        app.setAppReleaseId(rs.getString("app_id"));
        app.setAppReleaseAppVersion(rs.getString("app_version"));
        app.setAppReleaseDataRelease(rs.getString("data_release"));

        return app;
    }

}
