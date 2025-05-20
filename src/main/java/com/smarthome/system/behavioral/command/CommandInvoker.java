package com.smarthome.system.behavioral.command;

// CommandInvoker.java
import java.util.*;

public class CommandInvoker {
    private final List<Command> queue = new ArrayList<>();

    public void addCommand(Command cmd) {
        queue.add(cmd);
    }

    public void executeAll() {
        for (Command cmd : queue) cmd.execute();
        queue.clear();
    }
}
