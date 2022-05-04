package com.user.userService.controller;

import java.util.List;

import javax.annotation.Resource;

import com.user.userService.ApplicationService;
import com.user.userService.entity.AppRelease;

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

    @GetMapping(value = "/appVersionList")
    public List<AppRelease> getAppReleases() {
        return serviceApplication.getAppRelease();
    }

    @PostMapping(value = "/createAppVersion")
    public void createAppRelease(@RequestBody AppRelease appRelease) {
        serviceApplication.createAppRelease(appRelease);
    }

    @PutMapping(value = "/updateAppVersion")
    public void updateAppRelease(@RequestBody AppRelease appRelease) {
        serviceApplication.updateAppRelease(appRelease);
    }

    @PutMapping(value = "/executeUpdateAppVersion")
    public void executeUpdateAppRelease(@RequestBody AppRelease appRelease) {
        serviceApplication.executeUpdateAppRelease(appRelease);
    }

    @DeleteMapping(value = "/deleteAppVersion")
    public void deleteAppRelease(@RequestBody AppRelease appRelease) {
        serviceApplication.deleteAppRelease(appRelease);
    }
}
