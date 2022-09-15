package com.university.DepartmentsAndLectors;

import com.university.DepartmentsAndLectors.command.Command;
import com.university.DepartmentsAndLectors.command.resolver.CommandResolver;
import com.university.DepartmentsAndLectors.repository.DepartmentRepository;
import java.util.Scanner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ConsoleApplicationStarter {

    private final DepartmentRepository departmentRepository;
    private final CommandResolver commandResolver;

    @Autowired
    public ConsoleApplicationStarter(DepartmentRepository departmentRepository,
            CommandResolver commandResolver) {
        this.departmentRepository = departmentRepository;
        this.commandResolver = commandResolver;
    }

    public void startApplication() {
        String userInput;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Departments names:");
        departmentRepository.findAll()
                .forEach(department -> System.out.println(department.getDepartmentName()));

        do {
            System.out.println("Print your question or print Exit");
            userInput = scanner.nextLine();
            System.out.println();

            try {
                final Command command = commandResolver.resolveCommand(userInput);
                command.handle(userInput);
            } catch (Exception e) {
                System.err.println("Error happened during executing command: " + userInput);
            }
        } while (!userInput.equals("Exit"));
    }
}
