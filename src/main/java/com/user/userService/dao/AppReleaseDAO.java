package com.user.userService.dao;

import java.util.List;

import com.user.userService.entity.AppRelease;

public interface AppReleaseDAO {

    public List<AppRelease> getAppRelease();

    public void createAppRelease(AppRelease appRelease);

    public void updateAppRelease(AppRelease appRelease);

    public void executeUpdateAppRelease(AppRelease appRelease);

    public void deleteAppRelease(AppRelease appRelease);
}
