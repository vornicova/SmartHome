package com.smarthome.system.service;

import com.smarthome.system.model.Device;
import com.smarthome.system.model.Heating;

public class SmartHeatingFactory implements SmartHomeFactory {
    @Override
    public Device createLight(String name) {
        throw new UnsupportedOperationException("Эта фабрика создаёт только отопление!");
    }

    @Override
    public Device createHeating(String name) {
        return new Heating();
    }
}
