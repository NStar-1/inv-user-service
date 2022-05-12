package com.user.userService.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "application")
public class AppRelease {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "app_version")
    private String app_version;

    @Column(name = "data_release")
    private String data_release;
    

    public AppRelease() {
    }


    public AppRelease(int id, String app_version, String data_release) {
        this.id = id;
        this.app_version = app_version;
        this.data_release = data_release;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getApp_version() {
        return this.app_version;
    }

    public void setApp_version(String app_version) {
        this.app_version = app_version;
    }

    public String getData_release() {
        return this.data_release;
    }

    public void setData_release(String data_release) {
        this.data_release = data_release;
    }

}
