package com.university.DepartmentsAndLectors.command;

import com.university.DepartmentsAndLectors.repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ShowCountOfEmployeeCommand implements Command {

    private final DepartmentRepository departmentRepository;

    @Autowired
    public ShowCountOfEmployeeCommand(DepartmentRepository departmentRepository) {
        this.departmentRepository = departmentRepository;
    }

    @Override
    public void handle(String input) {
        String departmentName = input.replace(getCommandString(), "").trim();
        Integer countOfEmployee = departmentRepository.countEmployeeByDepartment(departmentName);
        System.out.println(countOfEmployee);
    }

    @Override
    public String getCommandString() {
        return "Show count of employee for";
    }

    @Override
    public boolean canHandleInput(String input) {
        return input.contains(getCommandString());
    }


}
