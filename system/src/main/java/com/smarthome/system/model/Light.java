package com.smarthome.system.model;

public class Light extends Device {
    public Light(String name) {
        super(name);
    }

    @Override
    public void turnOn() {
        System.out.println(name + " включен.");
    }

    @Override
    public void turnOff() {
        System.out.println(name + " выключен.");
    }
}
