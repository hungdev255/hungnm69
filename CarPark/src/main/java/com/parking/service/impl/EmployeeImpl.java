package com.parking.service.impl;

import com.parking.entities.Employee;
import com.parking.repository.EmployeeRepository;
import com.parking.service.EmployeeService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeImpl implements EmployeeService {

    private final EmployeeRepository employeeRepository;

    public EmployeeImpl(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    @Override
    public String addEmployee(Employee employee) {
        employeeRepository.save(employee);
        return employee.toString();
    }

    @Override
    public String deleteEmployeeByID(Integer employeeId) {
        employeeRepository.deleteById(employeeId);
        return "Deleted";
    }

    @Override
    public Employee findEmployeeById(Integer employeeId) {
        return this.employeeRepository.findByEmployeeId(employeeId);
    }

    @Override
    public List<Employee> findAllEmployee() {
        return employeeRepository.findAll();
    }


}
