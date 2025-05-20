package com.smarthome.system.behavioral.state;

public class OffState implements DeviceState {
    public void handle() {
        System.out.println("Устройство выключено");
    }
}
