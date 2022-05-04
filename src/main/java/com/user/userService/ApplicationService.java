package com.user.userService;

import java.util.List;

import com.user.userService.entity.AppRelease;

import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public interface ApplicationService {

	public List<AppRelease> getAppRelease();

    public void createAppRelease(AppRelease appRelease);

    public void updateAppRelease(AppRelease appRelease);

    public void executeUpdateAppRelease(AppRelease appRelease);

    public void deleteAppRelease(AppRelease appRelease);
}
