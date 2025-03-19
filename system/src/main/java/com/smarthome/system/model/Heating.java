package com.smarthome.system.model;

public class Heating extends Device {
    public Heating(String name) {
        super(name);
    }

    @Override
    public void turnOn() {
        System.out.println(name + " отопление включено.");
    }

    @Override
    public void turnOff() {
        System.out.println(name + " отопление выключено.");
    }
}
