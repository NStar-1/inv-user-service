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
    private ApplicationDAO applicationDAO;

    @Override
    @Transactional
    public List<Application> findAll() {
        
        return applicationDAO.findAll();
    }

    @Override
    @Transactional
    public void insertApplication(Application application) {
        
        applicationDAO.insertApplication(application);
    }

    @Override
    public void updateApplication(Application application) {
        
        applicationDAO.updateApplication(application);
    }

    @Override
    public void executeUpdateApplication(Application application) {
        
        applicationDAO.executeUpdateApplication(application);
    }

    @Override
    public void deleteApplication(Application application) {
        
        applicationDAO.deleteApplication(application);
        
    }
    
}
