package com.smarthome.system.behavioral.strategy;

public class EcoMode implements HeatingStrategy {
    public void heat() {
        System.out.println("Обогрев в режиме ЭКО");
    }
}
