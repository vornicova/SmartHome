package com.smarthome.system.structural;

import com.smarthome.system.model.Device;

public class SecureDeviceProxy extends Device {
    private final Device realDevice;
    private final String userRole;

    public SecureDeviceProxy(Device device, String userRole) {
        this.realDevice = device;
        this.userRole = userRole;
    }

    @Override
    public void turnOn() {
        System.out.println("[SecureProxy] Включение устройства..." );
        realDevice.turnOn();
    }

    @Override
    public void turnOff() {
        if ("ADMIN".equals(userRole)) {
            System.out.println("[SecureProxy] Выключение разрешено." );
            realDevice.turnOff();
        } else {
            System.out.println("[SecureProxy] Доступ запрещен для роли: " + userRole);
        }
    }
}