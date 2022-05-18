package com.user.userService.controller;

import java.util.List;

import javax.annotation.Resource;

import com.user.userService.ApplicationService;
import com.user.userService.entity.Application;

import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.boot.builder.SpringApplicationBuilder;


@RestController
//@SpringBootApplication
@RequestMapping("/app-info")
public class AppController extends SpringBootServletInitializer {

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(AppController.class);
    }

//    public static void main(String[] args) {
//        SpringApplication.run(AppController.class, args);
//    }

    @Resource
    ApplicationService serviceApplication;

    @GetMapping(value = "/app-list")
    public List<Application> getAppReleases() {
        return serviceApplication.findAll();
    }

    @PostMapping(value = "/create-app")
    public void createAppRelease(@RequestBody Application application) {
        serviceApplication.insertApplication(application);
    }

    @PutMapping(value = "/update-app")
    public void updateAppRelease(@RequestBody Application application) {
        serviceApplication.updateApplication(application);
    }

    @PutMapping(value = "/executeUpdate-app")
    public void executeUpdateAppRelease(@RequestBody Application application) {
        serviceApplication.executeUpdateApplication(application);
    }

    @DeleteMapping(value = "/delete-app")
    public void deleteAppRelease(@RequestBody Application application) {
        serviceApplication.deleteApplication(application);
    }
}
