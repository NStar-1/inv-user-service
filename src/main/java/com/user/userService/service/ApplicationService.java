package com.user.userService.service;

import java.util.List;

import com.user.userService.entity.ApplicationEntity;

public interface ApplicationService{


    public List<ApplicationEntity> findAll();

    public void insertApplication(ApplicationEntity application);

    public void updateApplication(ApplicationEntity application);

    public void executeUpdateApplication(ApplicationEntity application);

    public void deleteApplication(ApplicationEntity application);
}
