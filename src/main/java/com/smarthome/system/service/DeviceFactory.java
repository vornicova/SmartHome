package com.smarthome.system.service;

import com.smarthome.system.model.Device;
import com.smarthome.system.model.Light;
import com.smarthome.system.model.Heating;
import org.springframework.stereotype.Service;

@Service
public class DeviceFactory {
    public Device createDevice(String type, String name) {
        switch (type.toLowerCase()) {
            case "light":
                return new Light();
            case "heating":
                return new Heating();

            default:
                throw new IllegalArgumentException("Неизвестный тип устройства: " + type);
        }
    }
}
