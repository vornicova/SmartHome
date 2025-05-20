package com.smarthome.system.structural;

import com.smarthome.system.model.Device;
import java.util.ArrayList;
import java.util.List;

public class DeviceGroup extends Device {
    private final List<Device> devices = new ArrayList<>();

    public void add(Device device) {
        devices.add(device);
    }

    @Override
    public void turnOn() {
        System.out.println("[DeviceGroup] Включение группы устройств...");
        devices.forEach(Device::turnOn);
    }

    @Override
    public void turnOff() {
        System.out.println("[DeviceGroup] Выключение группы устройств...");
        devices.forEach(Device::turnOff);
    }
}
