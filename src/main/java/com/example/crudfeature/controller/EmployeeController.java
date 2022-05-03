package com.example.crudfeature.controller;

import com.example.crudfeature.model.Employee;
import com.example.crudfeature.service.EmployeeService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
public class EmployeeController {

    private final EmployeeService employeeService;

    @GetMapping("/employee")
    public List<Employee> getEmployee(EmployeeService employeeService){
        List<Employee> employees = employeeService.getEmployees();
        return employees;
    }

}
