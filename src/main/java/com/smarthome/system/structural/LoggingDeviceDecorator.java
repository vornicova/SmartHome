package com.smarthome.system.structural;

public class LoggingDeviceDecorator extends DeviceDecorator {

    public LoggingDeviceDecorator(com.smarthome.system.model.Device device) {
        super(device);
    }

    @Override
    public void turnOn() {
        System.out.println("[Logger] Включение устройства...");
        decoratedDevice.turnOn();
    }

    @Override
    public void turnOff() {
        System.out.println("[Logger] Выключение устройства...");
        decoratedDevice.turnOff();
    }
}