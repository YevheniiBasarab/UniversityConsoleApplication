package com.university.DepartmentsAndLectors.repository;

import com.university.DepartmentsAndLectors.entity.Lector;
import java.util.List;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LectorRepository extends CrudRepository<Lector, Integer> {

    List<Lector> findAllByLectorNameContaining(String searchInput);

}
