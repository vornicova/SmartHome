package com.smarthome.system.service;


import com.smarthome.system.model.Device;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Service
public class AutomationService {
    private final DeviceFactory deviceFactory;

    public AutomationService(DeviceFactory deviceFactory) {
        this.deviceFactory = deviceFactory;
    }

    public List<Device> createDefaultDevices() {
        return Stream.of(
                deviceFactory.createDevice("light", "Гостиная свет"),
                deviceFactory.createDevice("light", "Кухня свет"),
                deviceFactory.createDevice("heating", "Термостат 1")
        ).collect(Collectors.toList());
    }
}
