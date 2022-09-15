package com.university.DepartmentsAndLectors.command;

import com.university.DepartmentsAndLectors.repository.DepartmentRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ShowStatisticsCommand implements Command {

    private final DepartmentRepository departmentRepository;

    @Autowired
    public ShowStatisticsCommand(DepartmentRepository departmentRepository) {
        this.departmentRepository = departmentRepository;
    }

    @Override
    public void handle(String input) {
        String departmentName = input.replace("Show", "")
                .replace("statistics", "").trim();
        final List<List<String>> statisticsByDepartmentName = departmentRepository.findStatisticsByDepartmentName(
                departmentName);
        statisticsByDepartmentName.forEach(x -> System.out.println(x.get(0) + " - " + x.get(1)));
    }

    @Override
    public String getCommandString() {
        return "statistics";
    }

    @Override
    public boolean canHandleInput(String input) {
        return input.contains("Show") && input.contains("statistics");
    }


}
