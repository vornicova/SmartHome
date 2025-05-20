package com.smarthome.system.behavioral.observal;

public class NotificationService implements Observer {
    @Override
    public void update(String message) {
        System.out.println("Уведомление пользователю: " + message);
    }
}
