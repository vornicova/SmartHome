package com.smarthome.system.service;

import com.smarthome.system.model.Device;

public class DeviceBuilder {
    private String name;
    private boolean isSmart;
    private boolean hasRemoteControl;
    private int powerLevel;

    public DeviceBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public DeviceBuilder setSmart(boolean isSmart) {
        this.isSmart = isSmart;
        return this;
    }

    public DeviceBuilder setRemoteControl(boolean hasRemoteControl) {
        this.hasRemoteControl = hasRemoteControl;
        return this;
    }

    public DeviceBuilder setPowerLevel(int powerLevel) {
        this.powerLevel = powerLevel;
        return this;
    }

    public Device build() {
        return new Device(name, isSmart, hasRemoteControl, powerLevel) {
            @Override
            public void turnOn() {

            }

            @Override
            public void turnOff() {

            }
        };
    }
}
