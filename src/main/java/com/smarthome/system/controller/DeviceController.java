package com.smarthome.system.controller;

import com.smarthome.system.behavioral.state.*;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/device")
public class DeviceController {

    private final SmartDevice device = new SmartDevice();

    @PostMapping("/on")
    public String turnOn() {
        device.setState(new OnState());
        device.run();
        return "Устройство включено";
    }

    @PostMapping("/off")
    public String turnOff() {
        device.setState(new OffState());
        device.run();
        return "Устройство выключено";
    }
}
