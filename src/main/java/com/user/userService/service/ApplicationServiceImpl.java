package com.user.userService.service;

import java.util.List;

import com.user.userService.ApplicationService;
import com.user.userService.dao.AppReleaseDAO;
import com.user.userService.entity.AppRelease;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ApplicationServiceImpl implements ApplicationService {

    @Autowired
    private AppReleaseDAO appReleaseDAO;

    @Override
    @Transactional
    public List<AppRelease> getAppRelease() {
        
        return appReleaseDAO.getAppRelease();
    }

    @Override
    @Transactional
    public void createAppRelease(AppRelease appRelease) {
        
        appReleaseDAO.createAppRelease(appRelease);
    }

    @Override
    public void updateAppRelease(AppRelease appRelease) {
        
        appReleaseDAO.updateAppRelease(appRelease);
    }

    @Override
    public void executeUpdateAppRelease(AppRelease appRelease) {
        
        appReleaseDAO.executeUpdateAppRelease(appRelease);
    }

    @Override
    public void deleteAppRelease(AppRelease appRelease) {
        
        appReleaseDAO.deleteAppRelease(appRelease);
        
    }
    
}
