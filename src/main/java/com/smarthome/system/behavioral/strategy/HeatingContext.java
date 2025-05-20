package com.smarthome.system.behavioral.strategy;

public class HeatingContext {
    private HeatingStrategy strategy;

    public void setStrategy(HeatingStrategy s) {
        this.strategy = s;
    }

    public void heat() {
        if (strategy != null) strategy.heat();
    }
}
