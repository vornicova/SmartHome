package com.smarthome.system.behavioral.strategy;

public class ComfortMode implements HeatingStrategy {
    public void heat() {
        System.out.println("Обогрев в режиме КОМФОРТ");
    }
}
