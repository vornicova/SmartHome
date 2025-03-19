package com.smarthome.system.service;
import org.springframework.stereotype.Service;

@Service
public class SmartHomeSystem {
    private static SmartHomeSystem instance;

    private SmartHomeSystem() {
        System.out.println("Система 'Умный дом' запущена.");
    }

    public static synchronized SmartHomeSystem getInstance() {
        if (instance == null) {
            instance = new SmartHomeSystem();
        }
        return instance;
    }

    public void executeCommand(String device, String action) {
        System.out.println("Выполняю команду '" + action + "' для устройства: " + device);
    }
}
