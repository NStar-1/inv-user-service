package com.user.userService.controller;

import java.util.List;

import javax.annotation.Resource;

import com.user.userService.ApplicationService;
import com.user.userService.entity.Application;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/appInfo")
public class AppController {

    @Resource
    ApplicationService serviceApplication;

    @GetMapping(value = "/appList")
    public List<Application> getAppReleases() {
        return serviceApplication.getApplications();
    }

    @PostMapping(value = "/createApp")
    public void createAppRelease(@RequestBody Application appRelease) {
        serviceApplication.createAppRelease(appRelease);
    }

    @PutMapping(value = "/updateApp")
    public void updateAppRelease(@RequestBody Application appRelease) {
        serviceApplication.updateAppRelease(appRelease);
    }

    @PutMapping(value = "/executeUpdateApp")
    public void executeUpdateAppRelease(@RequestBody Application appRelease) {
        serviceApplication.executeUpdateAppRelease(appRelease);
    }

    @DeleteMapping(value = "/deleteApp")
    public void deleteAppRelease(@RequestBody Application appRelease) {
        serviceApplication.deleteAppRelease(appRelease);
    }
}
