package com.user.userService;

import java.util.List;

import com.user.userService.entity.applicationEntity;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


//@SpringBootApplication
public interface ApplicationService{

//    public static void main(String[] args) {
//        SpringApplication.run(ApplicationService.class, args);
//    }

    public List<applicationEntity> findAll();

    public void insertApplication(applicationEntity application);

    public void updateApplication(applicationEntity application);

    public void executeUpdateApplication(applicationEntity application);

    public void deleteApplication(applicationEntity application);
}
