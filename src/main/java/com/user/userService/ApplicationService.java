package com.user.userService;

import java.util.List;

import com.user.userService.entity.Application;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


//@SpringBootApplication
public interface ApplicationService{

//    public static void main(String[] args) {
//        SpringApplication.run(ApplicationService.class, args);
//    }

    public List<Application> findAll();

    public void insertApplication(Application application);

    public void updateApplication(Application application);

    public void executeUpdateApplication(Application application);

    public void deleteApplication(Application application);
}
