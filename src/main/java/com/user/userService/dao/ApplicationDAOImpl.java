package com.user.userService.dao;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import com.user.userService.entity.ApplicationEntity;
import com.user.userService.mapper.ApplicationRowMapper;

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
public class ApplicationDAOImpl implements ApplicationDAO {

    NamedParameterJdbcTemplate template;

    public ApplicationDAOImpl(NamedParameterJdbcTemplate template) {
        this.template = template;
    }

    @Override
    public List<ApplicationEntity> findAll() {
        return template.query("select * from application", new ApplicationRowMapper());
    }

    @Override
    public void insertApplication(ApplicationEntity application) {
        final String sql = "insert into application(id, app_version , data_release) values(:id,:app_version,:data_release)";

        KeyHolder holder = new GeneratedKeyHolder();
        SqlParameterSource param = new MapSqlParameterSource()
                .addValue("id", application.getId())
                .addValue("app_version", application.getAppVersion())
                .addValue("data_release", application.getDataRelease());
        template.update(sql, param, holder);

    }

    @Override
    public void updateApplication(ApplicationEntity application) {
        final String sql = "update application set app_version=:app_version, data_release=:data_release where id=:id";

        KeyHolder holder = new GeneratedKeyHolder();
        SqlParameterSource param = new MapSqlParameterSource()
                .addValue("id", application.getId())
                .addValue("app_version", application.getAppVersion())
                .addValue("data_release", application.getDataRelease());
        template.update(sql, param, holder);
    }

    @Override
    public void executeUpdateApplication(ApplicationEntity application) {
        final String sql = "delete from employee where app_id=:app_id";

        Map<String, Object> map = new HashMap<String, Object>();
        map.put("id", application.getId());

        template.execute(sql, map, new PreparedStatementCallback<Object>() {
            @Override
            public Object doInPreparedStatement(PreparedStatement ps)
                    throws SQLException, DataAccessException {
                return ps.executeUpdate();
            }
        });
    }

    @Override
    public void deleteApplication(ApplicationEntity application) {
        final String sql = "update application set app_version=:app_version, data_release=:data_release where id=:id";

        Map<String, Object> map = new HashMap<String, Object>();
        map.put("id", application.getId());
        map.put("app_version", application.getAppVersion());
        map.put("data_release", application.getDataRelease());

        template.execute(sql, map, new PreparedStatementCallback<Object>() {
            @Override
            public Object doInPreparedStatement(PreparedStatement ps)
                    throws SQLException, DataAccessException {
                return ps.executeUpdate();
            }
        });

    }
}
