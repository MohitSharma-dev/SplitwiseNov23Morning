package com.backendlld.splitwisenov23morning.commands;

import java.util.List;

public class CommandExecutor {
    private List<Command> commands;

    public void add(Command command) {
        commands.add(command);
    }

    public void remove(Command command) {
        commands.remove(command);
    }

    public void execute(String input) {
        for (Command command : commands) {
            if(command.matches(input)){
                command.execute(input);
            }
        }
    }
}
