package com.university.DepartmentsAndLectors.command;

import com.university.DepartmentsAndLectors.entity.Department;
import com.university.DepartmentsAndLectors.repository.DepartmentRepository;
import org.springframework.stereotype.Component;

@Component
public class HeadOfDepartmentCommand implements Command {

    private final DepartmentRepository departmentRepository;

    public HeadOfDepartmentCommand(DepartmentRepository departmentRepository) {
        this.departmentRepository = departmentRepository;
    }

    @Override
    public void handle(String input) {
        String departmentName = input.replace(getCommandString(), "").trim();
        Department department = departmentRepository.findByDepartmentName(departmentName);
        System.out.println("Answer: Head of " + departmentName + "department is " + department.getDepartmentHead()
                .getLectorName());
    }

    @Override
    public String getCommandString() {
        return "Who is head of department";
    }

    @Override
    public boolean canHandleInput(String input) {
        return input.contains("Who is head of department");
    }
}
