package com.example.crudfeature.service;

import com.example.crudfeature.model.Employee;

import java.util.List;
import java.util.Optional;

public interface EmployeeService {

    List<Employee> getEmployees();
    Optional<Employee> getEmployeeById(int id);
    void updateEmployee(Employee employee);
    void deleteEmployee(int id);
}
