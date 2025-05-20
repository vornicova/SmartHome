package com.smarthome.system.service;

import com.smarthome.system.model.Device;
import com.smarthome.system.model.Light;

public class SmartLightingFactory implements SmartHomeFactory {
    @Override
    public Device createLight(String name) {
        return new Light();
    }

    @Override
    public Device createHeating(String name) {
        throw new UnsupportedOperationException("Эта фабрика создаёт только освещение!");
    }
}
