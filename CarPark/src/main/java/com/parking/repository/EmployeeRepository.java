package com.parking.repository;


import com.parking.entities.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

    Employee findByEmployeeId(Integer id);

    List<Employee> findAll();


}
