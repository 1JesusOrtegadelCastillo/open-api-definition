package com.example.crudfeature.service;

import com.example.crudfeature.model.Employee;

import java.util.List;
import java.util.Optional;

public interface EmployeeService {

    Employee newEmployee(Employee employee);
    List<Employee> getEmployees();
    Optional<Employee> getEmployeeById(Long id);
    Employee updateEmployee(Long id);
    void deleteEmployee(Long id);
}
