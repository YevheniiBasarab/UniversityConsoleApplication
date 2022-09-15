package com.university.DepartmentsAndLectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DepartmentsAndLectorsApplication implements CommandLineRunner {
    @Autowired
    private ConsoleApplicationStarter consoleApplicationStarter;

    public static void main(String[] args) {
        SpringApplication.run(DepartmentsAndLectorsApplication.class, args);
    }

    @Override
    public void run(String... args) {
        consoleApplicationStarter.startApplication();
    }
}
