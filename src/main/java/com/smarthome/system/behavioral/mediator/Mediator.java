package com.smarthome.system.behavioral.mediator;

import java.awt.*;

public interface Mediator {
    void notify(Component sender, String event);
}
