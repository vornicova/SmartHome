package com.smarthome.system.controller;

import com.smarthome.system.model.Device;
import com.smarthome.system.service.DeviceBuilder;
import com.smarthome.system.service.DeviceFactory;
import com.smarthome.system.service.SmartHomeSystem;
import com.smarthome.system.service.SmartHomeFactory;
import com.smarthome.system.service.SmartLightingFactory;
import com.smarthome.system.service.SmartHeatingFactory;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/home")

public class HomeController {
    private final DeviceFactory deviceFactory;
    private Device builtDevice; // Сюда будем сохранять последнее созданное устройство
    private final SmartHomeFactory lightingFactory = new SmartLightingFactory();
    private final SmartHomeFactory heatingFactory = new SmartHeatingFactory();

    public HomeController(SmartHomeSystem smartHomeSystem, DeviceFactory deviceFactory) {
        this.deviceFactory = deviceFactory;
    }


    @PostMapping("/device/build")
    public String buildDevice(@RequestBody DeviceRequest request) {
        builtDevice = new DeviceBuilder()
                .setName(request.getName())
                .setSmart(request.isSmart())
                .setRemoteControl(request.isHasRemoteControl())
                .setPowerLevel(request.getPowerLevel())
                .build();

        return "Устройство создано: " + builtDevice;
    }

    @PostMapping("/device/clone")
    public String cloneDevice() {
        if (builtDevice == null) {
            return "Сначала создайте устройство через /device/build";
        }
        Device clonedDevice = builtDevice.clone();
        return "Клонировано устройство: " + clonedDevice;
    }

    @PostMapping("/factory/light")
    public String createLight(@RequestParam String name) {
        Device light = lightingFactory.createLight(name);
        return "Создано освещение: " + light;
    }

    @PostMapping("/factory/heating")
    public String createHeating(@RequestParam String name) {
        Device heating = heatingFactory.createHeating(name);
        return "Создано отопление: " + heating;
    }


        @PostMapping("/device/create")
        public Device createDevice(@RequestBody DeviceRequest request) {
            return deviceFactory.createDevice(request.getType(), request.getName());
        }
}