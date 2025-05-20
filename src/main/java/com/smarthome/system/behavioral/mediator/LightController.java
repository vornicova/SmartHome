package com.smarthome.system.behavioral.mediator;

// LightController.java
public class LightController extends Component {
    public LightController(Mediator mediator) {
        super(mediator);
    }

    public void turnOnLight() {
        System.out.println("💡 Свет включён");
    }
}
