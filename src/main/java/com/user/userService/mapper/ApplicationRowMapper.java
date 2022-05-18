package com.user.userService.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.user.userService.entity.ApplicationEntity;

import org.springframework.jdbc.core.RowMapper;

public class ApplicationRowMapper implements RowMapper<ApplicationEntity> {

    @Override
    public ApplicationEntity mapRow(ResultSet rs, int arg1) throws SQLException {
        ApplicationEntity app = new ApplicationEntity();
        app.setId(rs.getInt("id"));
        app.setAppVersion(rs.getString("app_version"));
        app.setDataRelease(rs.getString("data_release"));

        return app;
    }

}
