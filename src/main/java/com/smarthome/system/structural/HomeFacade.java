package com.smarthome.system.structural;

import com.smarthome.system.model.Device;

public class HomeFacade {
    private final Device light;
    private final Device heating;
    private final Device alarm;

    public HomeFacade(Device light, Device heating, Device alarm) {
        this.light = light;
        this.heating = heating;
        this.alarm = alarm;
    }

    public void leaveHome() {
        System.out.println("[HomeFacade] Активация сценария 'Ушел из дома'...");
        light.turnOff();
        heating.turnOff();
        alarm.turnOn();
    }
}
