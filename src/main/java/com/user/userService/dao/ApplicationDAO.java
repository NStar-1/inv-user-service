package com.user.userService.dao;

import java.util.List;

import com.user.userService.entity.Application;

public interface ApplicationDAO {

    public List<Application> findAll();

    public void insertApplication(Application application);

    public void updateApplication(Application application);

    public void executeUpdateApplication(Application application);

    public void deleteApplication(Application application);
}
