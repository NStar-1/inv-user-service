package com.user.userService.service;

import java.util.List;

import com.user.userService.dao.ApplicationDAO;
import com.user.userService.entity.ApplicationEntity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
//import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

//import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.boot.builder.SpringApplicationBuilder;

@Service
public class ApplicationServiceImpl /*extends SpringBootServletInitializer*/ implements ApplicationService {

    @Autowired
    private ApplicationDAO applicationDAO;

//    @Override
//    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
//        return application.sources(ApplicationServiceImpl.class);
//    }

    @Override
    @Transactional
    public List<ApplicationEntity> findAll() {
        
        return applicationDAO.findAll();
    }

    @Override
    @Transactional
    public void insertApplication(ApplicationEntity application) {
        
        applicationDAO.insertApplication(application);
    }

    @Override
    public void updateApplication(ApplicationEntity application) {
        
        applicationDAO.updateApplication(application);
    }

    @Override
    public void executeUpdateApplication(ApplicationEntity application) {
        
        applicationDAO.executeUpdateApplication(application);
    }

    @Override
    public void deleteApplication(ApplicationEntity application) {
        
        applicationDAO.deleteApplication(application);
        
    }
    
}
