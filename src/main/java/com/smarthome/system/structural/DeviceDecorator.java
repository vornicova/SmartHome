package com.smarthome.system.structural;

import com.smarthome.system.model.Device;

public abstract class DeviceDecorator extends Device {
    protected final Device decoratedDevice;

    public DeviceDecorator(Device device) {
        this.decoratedDevice = device;
    }
}
