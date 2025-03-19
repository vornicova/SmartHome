package com.smarthome.system.service;

import com.smarthome.system.model.Device;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class DeviceService {
    private final DeviceFactory deviceFactory;
    private final Map<String, Device> devices = new HashMap<>();

    public DeviceService(DeviceFactory deviceFactory) {
        this.deviceFactory = deviceFactory;
    }

    public Device registerDevice(String type, String name) {
        Device device = deviceFactory.createDevice(type, name);
        devices.put(name, device);
        return device;
    }

    public Device getDevice(String name) {
        return devices.get(name);
    }
}
