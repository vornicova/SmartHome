package com.smarthome.system.behavioral.mediator;

public class DoorSensor extends Component {
    public DoorSensor(Mediator mediator) {
        super(mediator);
    }

    public void open() {
        System.out.println("Дверь открыта");
        mediator.notify(this, "doorOpened");
    }
}
