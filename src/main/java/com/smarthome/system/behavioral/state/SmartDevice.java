package com.smarthome.system.behavioral.state;

public class SmartDevice {
    private DeviceState state;

    public void setState(DeviceState s) {
        this.state = s;
    }

    public void run() {
        if (state != null) state.handle();
    }
}
