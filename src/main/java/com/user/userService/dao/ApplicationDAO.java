package com.user.userService.dao;

import java.util.List;

import com.user.userService.entity.applicationEntity;

public interface ApplicationDAO {

    public List<applicationEntity> findAll();

    public void insertApplication(applicationEntity application);

    public void updateApplication(applicationEntity application);

    public void executeUpdateApplication(applicationEntity application);

    public void deleteApplication(applicationEntity application);
}
