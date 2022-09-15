package com.university.DepartmentsAndLectors.command;

import com.university.DepartmentsAndLectors.repository.DepartmentRepository;
import org.springframework.stereotype.Component;

@Component
public class ShowAvarageSalaryCommand implements Command {

    private final DepartmentRepository departmentRepository;

    public ShowAvarageSalaryCommand(DepartmentRepository departmentRepository) {
        this.departmentRepository = departmentRepository;
    }

    @Override
    public void handle(String input) {
        String departmentName = input.replace(getCommandString(), "").trim();
        Double averageSalaryByDepartment = departmentRepository.findAverageSalaryByDepartment(departmentName);
        System.out.println("The average salary of " + departmentName + " is " + averageSalaryByDepartment);
    }

    @Override
    public String getCommandString() {
        return "Show the average salary for the department";
    }

    @Override
    public boolean canHandleInput(String input) {
        return input.contains(getCommandString());
    }


}
