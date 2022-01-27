package com.parking.service;

import com.parking.entities.Employee;

import java.util.List;

public interface EmployeeService {

     String addEmployee(Employee employee);

     String deleteEmployeeByID(Integer employeeId);

     Employee findEmployeeById(Integer employeeId);

     List<Employee> findAllEmployee();

}
