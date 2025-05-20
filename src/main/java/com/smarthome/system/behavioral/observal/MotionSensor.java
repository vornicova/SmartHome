package com.smarthome.system.behavioral.observal;

import java.util.ArrayList;
import java.util.List;

public class MotionSensor {
    private final List<Observer> observers = new ArrayList<>();

    public void detectMotion() {
        System.out.println("Движение обнаружено!");
        notifyObservers("Motion detected!");
    }

    public void addObserver(Observer o) { observers.add(o); }

    public void removeObserver(Observer o) { observers.remove(o); }

    public void notifyObservers(String msg) {
        for (Observer o : observers) o.update(msg);
    }
}
