package com.user.userService;

import java.util.List;

import com.user.userService.entity.Application;

import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public interface ApplicationService {

	public List<Application> getApplications();

    public void createAppRelease(Application application);

    public void updateAppRelease(Application application);

    public void executeUpdateAppRelease(Application application);

    public void deleteAppRelease(Application application);
}
