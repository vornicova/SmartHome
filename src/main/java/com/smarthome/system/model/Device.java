package com.smarthome.system.model;

public class Device implements Cloneable {
    protected String name;
    protected boolean isSmart;
    protected boolean hasRemoteControl;
    protected int powerLevel;

    public Device(String name, boolean isSmart, boolean hasRemoteControl, int powerLevel) {
        this.name = name;
        this.isSmart = isSmart;
        this.hasRemoteControl = hasRemoteControl;
        this.powerLevel = powerLevel;
    }



    public Device() {

    }

    public void turnOn() {
        System.out.println(name + " включен.");
    }

    public void turnOff() {
        System.out.println(name + " выключен.");
    }

    @Override
    public Device clone() {
        try {
            return (Device) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException("Ошибка при клонировании устройства", e);
        }
    }

    @Override
    public String toString() {
        return "Device{name='" + name + "', smart=" + isSmart +
                ", remoteControl=" + hasRemoteControl +
                ", powerLevel=" + powerLevel + "}";
    }
}
