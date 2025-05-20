package com.smarthome.system.behavioral.state;

public class OnState implements DeviceState {
    public void handle() {
        System.out.println("Устройство включено");
    }
}
