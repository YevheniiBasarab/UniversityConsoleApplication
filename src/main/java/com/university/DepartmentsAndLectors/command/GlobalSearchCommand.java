package com.university.DepartmentsAndLectors.command;

import com.university.DepartmentsAndLectors.entity.Department;
import com.university.DepartmentsAndLectors.entity.Lector;
import com.university.DepartmentsAndLectors.repository.DepartmentRepository;
import com.university.DepartmentsAndLectors.repository.LectorRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class GlobalSearchCommand implements Command {

    private final DepartmentRepository departmentRepository;
    private final LectorRepository lectorRepository;

    @Autowired
    public GlobalSearchCommand(DepartmentRepository departmentRepository,
            LectorRepository lectorRepository) {
        this.departmentRepository = departmentRepository;
        this.lectorRepository = lectorRepository;
    }

    @Override
    public void handle(String input) {
        String searchInput = input
                .replace(getCommandString(), "")
                .trim();
        final List<Department> allByDepartmentNameLike = departmentRepository.findAllByDepartmentNameContaining(
                searchInput);
        if (!allByDepartmentNameLike.isEmpty()) {
            System.out.println("Departments matched: ");
            allByDepartmentNameLike.forEach(x -> System.out.println(x.getDepartmentName()));
        }

        final List<Lector> allByLectorNameLike = lectorRepository.findAllByLectorNameContaining(searchInput);
        if (!allByLectorNameLike.isEmpty()) {
            System.out.println("Lectors matched: ");
            allByLectorNameLike.forEach(x -> System.out.println(x.getLectorName()));
        }
    }

    @Override
    public String getCommandString() {
        return "Global search by";
    }

    @Override
    public boolean canHandleInput(String input) {
        return input.contains(getCommandString());
    }


}
