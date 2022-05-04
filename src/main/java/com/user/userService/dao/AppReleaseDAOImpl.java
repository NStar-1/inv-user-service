package com.user.userService.dao;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import com.user.userService.entity.AppRelease;
import com.user.userService.mapper.AppReleaseRowMapper;

import java.util.HashMap;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.PreparedStatementCallback;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Repository;

@Repository
public class AppReleaseDAOImpl implements AppReleaseDAO {

    NamedParameterJdbcTemplate template;

    public AppReleaseDAOImpl(NamedParameterJdbcTemplate template) {
        this.template = template;
    }

    @Override
    public List<AppRelease> getAppRelease() {
        return template.query("select * from app_version", new AppReleaseRowMapper());
    }

    @Override
    public void createAppRelease(AppRelease appRelease) {
        final String sql = "insert into application(app_id, app_version , data_release) values(:app_id,:app_version,:data_release)";

        KeyHolder holder = new GeneratedKeyHolder();
        SqlParameterSource param = new MapSqlParameterSource()
                .addValue("app_id", appRelease.getAppId())
                .addValue("app_version", appRelease.getAppVersion())
                .addValue("data_release", appRelease.getDataRelease());
        template.update(sql, param, holder);

    }

    @Override
    public void updateAppRelease(AppRelease appRelease) {
        final String sql = "update application set app_version=:app_version, data_release=:data_release where app_id=:app_id";

        KeyHolder holder = new GeneratedKeyHolder();
        SqlParameterSource param = new MapSqlParameterSource()
                .addValue("app_id", appRelease.getAppId())
                .addValue("app_version", appRelease.getAppVersion())
                .addValue("data_release", appRelease.getDataRelease());
        template.update(sql, param, holder);
    }

    @Override
    public void deleteAppRelease(AppRelease appRelease) {
        final String sql = "delete from employee where app_id=:app_id";

        Map<String, Object> map = new HashMap<String, Object>();
        map.put("app_id", appRelease.getAppId());

        template.execute(sql, map, new PreparedStatementCallback<Object>() {
            @Override
            public Object doInPreparedStatement(PreparedStatement ps)
                    throws SQLException, DataAccessException {
                return ps.executeUpdate();
            }
        });
    }

    @Override
    public void executeUpdateAppRelease(AppRelease appRelease) {
        final String sql = "update application set app_version=:app_version, data_release=:data_release where app_id=:app_id";

        Map<String, Object> map = new HashMap<String, Object>();
        map.put("app_id", appRelease.getAppId());
        map.put("app_version", appRelease.getAppVersion());
        map.put("data_release", appRelease.getDataRelease());

        template.execute(sql, map, new PreparedStatementCallback<Object>() {
            @Override
            public Object doInPreparedStatement(PreparedStatement ps)
                    throws SQLException, DataAccessException {
                return ps.executeUpdate();
            }
        });

    }
}
