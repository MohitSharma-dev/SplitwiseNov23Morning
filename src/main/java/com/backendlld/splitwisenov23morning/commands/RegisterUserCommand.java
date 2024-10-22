package com.backendlld.splitwisenov23morning.commands;

import java.util.List;

public class RegisterUserCommand implements Command{
    @Override
    public boolean matches(String command) {
        List<String> words = List.of(command.split(" "));
        return words.get(0).equals("RegisterUser") && words.size() == 3;
    }

    @Override
    public void execute(String command) {
        List<String> words = List.of(command.split(" "));
        String email = words.get(1);
        String password = words.get(2);
//        call the corresponding controller
    }
}
