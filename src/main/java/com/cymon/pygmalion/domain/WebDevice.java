package com.cymon.pygmalion.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Created by simon on 19/09/17.
 */

@Entity
public class WebDevice {

//State

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer Id;

    private String deviceType;

    private String deviceName;

    private int deviceUseRatio;

//Constructors

    public WebDevice(String deviceType, String deviceName) {
        this.deviceType = deviceType;
        this.deviceName = deviceName;
    }

//Getters and Setters

    public String getDeviceType() {
        return deviceType;
    }

    public void setDeviceType(String deviceType) {
        this.deviceType = deviceType;
    }

    public String getDeviceName() {
        return deviceName;
    }

    public void setDeviceName(String deviceName) {
        this.deviceName = deviceName;
    }

    public Integer getId() {
        return Id;
    }

    public int getDeviceUseRatio() {
        return deviceUseRatio;
    }

    public void setDeviceUseRatio(int deviceUseRatio) {
        this.deviceUseRatio = deviceUseRatio;
    }
}
