package com.smarthome.system.service;
import com.smarthome.system.model.Device;

public interface SmartHomeFactory {
    Device createLight(String name);
    Device createHeating(String name);
}
