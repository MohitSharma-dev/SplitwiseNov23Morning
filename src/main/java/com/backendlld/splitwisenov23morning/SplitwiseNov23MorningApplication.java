package com.backendlld.splitwisenov23morning;

import com.backendlld.splitwisenov23morning.commands.Command;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

@SpringBootApplication
public class SplitwiseNov23MorningApplication implements CommandLineRunner {
    private static Scanner scanner = new Scanner(System.in);
    private List<Command> commands = new ArrayList<>();
    @Override
    public void run(String... args) throws Exception {
        String input = scanner.nextLine();
//
        for(Command command : commands) {
            if((command.matches(input))){
                command.execute(input);
            }
        }

    }

    public static void main(String[] args) {
        SpringApplication.run(SplitwiseNov23MorningApplication.class, args);
    }

}


// should have flexibility to add new commands
// commands responsibility to know all the nuances of code
