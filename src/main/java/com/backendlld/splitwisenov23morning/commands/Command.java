package com.backendlld.splitwisenov23morning.commands;

public interface Command {
    boolean matches(String command);
    void execute(String command);
}
