package com.user.userService.service;

import java.util.List;

import com.user.userService.ApplicationService;
import com.user.userService.dao.ApplicationDAO;
import com.user.userService.entity.Application;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ApplicationServiceImpl implements ApplicationService {

    @Autowired
    private ApplicationDAO appReleaseDAO;

    @Override
    @Transactional
    public List<Application> getAppRelease() {
        
        return appReleaseDAO.getAppRelease();
    }

    @Override
    @Transactional
    public void createAppRelease(Application appRelease) {
        
        appReleaseDAO.createAppRelease(appRelease);
    }

    @Override
    public void updateAppRelease(Application appRelease) {
        
        appReleaseDAO.updateAppRelease(appRelease);
    }

    @Override
    public void executeUpdateAppRelease(Application appRelease) {
        
        appReleaseDAO.executeUpdateAppRelease(appRelease);
    }

    @Override
    public void deleteAppRelease(Application appRelease) {
        
        appReleaseDAO.deleteAppRelease(appRelease);
        
    }
    
}
