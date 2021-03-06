package com.user.userService.dao;

import java.util.List;

import com.user.userService.entity.ApplicationEntity;

public interface ApplicationDAO {

    public List<ApplicationEntity> findAll();

    public void insertApplication(ApplicationEntity application);

    public void updateApplication(ApplicationEntity application);

    public void executeUpdateApplication(ApplicationEntity application);

    public void deleteApplication(ApplicationEntity application);
}
