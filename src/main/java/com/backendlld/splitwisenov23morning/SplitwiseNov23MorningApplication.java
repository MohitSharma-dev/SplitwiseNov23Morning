package com.backendlld.splitwisenov23morning;

import com.backendlld.splitwisenov23morning.commands.Command;
import com.backendlld.splitwisenov23morning.commands.CommandExecutor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

@SpringBootApplication
public class SplitwiseNov23MorningApplication implements CommandLineRunner {
    private static Scanner scanner = new Scanner(System.in);
    private CommandExecutor commandExecutor = new CommandExecutor();
    @Override
    public void run(String... args) throws Exception {
        String input = scanner.nextLine();
//
        commandExecutor.execute(input);

    }

    public static void main(String[] args) {
        SpringApplication.run(SplitwiseNov23MorningApplication.class, args);
    }

}


// should have flexibility to add new commands
// commands responsibility to know all the nuances of code
