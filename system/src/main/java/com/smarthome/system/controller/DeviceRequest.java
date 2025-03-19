package com.smarthome.system.controller;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class DeviceRequest {
    private String type;
    private String name;

    public boolean isHasRemoteControl() {
        return type.equalsIgnoreCase("remote");
    }

    public int getPowerLevel() {
        return Integer.parseInt(name);
    }

    public boolean isSmart() {
        return type.equalsIgnoreCase("smart");
    }
}
