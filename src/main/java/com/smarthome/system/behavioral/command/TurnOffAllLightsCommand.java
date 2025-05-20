package com.smarthome.system.behavioral.command;

import com.smarthome.system.service.LightService;

public class TurnOffAllLightsCommand implements Command {
    private final LightService lightService;

    public TurnOffAllLightsCommand(LightService service) {
        this.lightService = service;
    }

    public void execute() {
        lightService.turnOffAllLights();
    }
}
