package com.university.DepartmentsAndLectors.repository;

import com.university.DepartmentsAndLectors.entity.Department;
import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentRepository extends CrudRepository<Department, Integer> {

    Department findByDepartmentName(String departmentName);

    @Query(value = "select AVG(lector.lector_salary) FROM lector " +
            "JOIN department_lector on lector.lector_id = department_lector.lector_id " +
            "JOIN department ON department_lector.department_id = department.department_id " +
            "WHERE department.department_name = :departmentName", nativeQuery = true)
    Double findAverageSalaryByDepartment(@Param("departmentName") String departmentName);

    @Query(value = "select COUNT(*) as count FROM lector " +
            "JOIN department_lector on lector.lector_id = department_lector.lector_id " +
            "JOIN department ON department_lector.department_id = department.department_id " +
            "WHERE department.department_name = :departmentName", nativeQuery = true)
    Integer countEmployeeByDepartment(@Param("departmentName") String departmentName);

    @Query(value = "SELECT degree_name as degree, count(degree_name) AS count "
            + "FROM department "
            + "         JOIN department_lector dl "
            + "              ON department.department_name = :departmentName "
            + "                  AND department.department_id = dl.department_id "
            + "         JOIN lector l ON l.lector_id = dl.lector_id "
            + "         JOIN degree d ON d.degree_id = l.lector_degree_id "
            + "GROUP BY degree_name", nativeQuery = true)
    List<List<String>> findStatisticsByDepartmentName(@Param("departmentName") String departmentName);

    List<Department> findAllByDepartmentNameContaining(String searchInput);

}
