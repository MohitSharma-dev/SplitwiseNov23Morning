package com.backendlld.splitwisenov23morning;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;
import java.util.Scanner;

@SpringBootApplication
public class SplitwiseNov23MorningApplication implements CommandLineRunner {
    private static Scanner scanner = new Scanner(System.in);
    @Override
    public void run(String... args) throws Exception {
        String input = scanner.nextLine();
//        first try to match it with a command using the first word
        List<String> words = List.of(input.split(" "));
//        RegisterUser email password
        if(words.get(0).equals("RegisterUser") && words.size() == 3){
            String email = words.get(1);
            String password = words.get(2);
//            create a request DTO
//            call the corresponding controller
        }

    }

    public static void main(String[] args) {
        SpringApplication.run(SplitwiseNov23MorningApplication.class, args);
    }

}


// should have flexibility to add new commands
// commands responsibility to know all the nuances of code
