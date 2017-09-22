package com.cymon.pygmalion.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Created by simon on 19/09/17.
 */

@Entity
public class Webdevice {

//State

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String devicetype;

    private String devicename;

//Constructors

    public Webdevice(String deviceType, String deviceName) {
        this.devicetype = deviceType;
        this.devicename = deviceName;
    }

    public Webdevice() {
    }

    //Getters and Setters

    public String getDeviceType() {
        return devicetype;
    }

    public void setDeviceType(String deviceType) {
        this.devicetype = deviceType;
    }

    public String getDeviceName() {
        return devicename;
    }

    public void setDeviceName(String deviceName) {
        this.devicename = deviceName;
    }

    public Integer getId() {
        return id;
    }

}
