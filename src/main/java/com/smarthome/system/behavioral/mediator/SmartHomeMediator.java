package com.smarthome.system.behavioral.mediator;

// SmartHomeMediator.java
public class SmartHomeMediator implements Mediator {
    private DoorSensor doorSensor;
    private LightController lightController;

    public void setDoorSensor(DoorSensor ds) {
        this.doorSensor = ds;
    }

    public void setLightController(LightController lc) {
        this.lightController = lc;
    }

    public void notify(Component sender, String event) {
        if (sender == doorSensor && event.equals("doorOpened")) {
            lightController.turnOnLight();
        }
    }
}
