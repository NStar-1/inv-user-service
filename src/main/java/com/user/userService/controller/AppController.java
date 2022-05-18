package com.user.userService.controller;

import java.util.List;

import javax.annotation.Resource;

import com.user.userService.entity.ApplicationEntity;
import com.user.userService.service.ApplicationService;

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
@RequestMapping("/app-info")
public class AppController extends SpringBootServletInitializer {

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(AppController.class);
    }

    @Resource
    ApplicationService serviceApplication;

    @GetMapping(value = "/app-list")
    public List<ApplicationEntity> getAppReleases() {
        return serviceApplication.findAll();
    }

    @PostMapping(value = "/create-app")
    public void createAppRelease(@RequestBody ApplicationEntity application) {
        serviceApplication.insertApplication(application);
    }

    @PutMapping(value = "/update-app")
    public void updateAppRelease(@RequestBody ApplicationEntity application) {
        serviceApplication.updateApplication(application);
    }

    @PutMapping(value = "/executeUpdate-app")
    public void executeUpdateAppRelease(@RequestBody ApplicationEntity application) {
        serviceApplication.executeUpdateApplication(application);
    }

    @DeleteMapping(value = "/delete-app")
    public void deleteAppRelease(@RequestBody ApplicationEntity application) {
        serviceApplication.deleteApplication(application);
    }
}
