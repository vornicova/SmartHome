package com.smarthome.system.structural;

import com.smarthome.system.model.Device;

public class AlarmAdapter extends Device {
    private final LegacyAlarm legacyAlarm;

    public AlarmAdapter(LegacyAlarm legacyAlarm) {
        this.legacyAlarm = legacyAlarm;
    }

    @Override
    public void turnOn() {
        legacyAlarm.activate();
    }

    @Override
    public void turnOff() {
        System.out.println("[AlarmAdapter] LegacyAlarm нельзя отключить удалённо.");
    }
}
