package com.example.crudfeature.service;

import com.example.crudfeature.exception.ApiRequestException;
import com.example.crudfeature.model.Employee;
import com.example.crudfeature.repository.EmployeeRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class EmployeeServiceImpl implements EmployeeService {

    private final EmployeeRepository employeeRepository;

    @Override
    public Employee newEmployee(Employee employee) {
       return employeeRepository.save(employee);
    }

    @Override
    public List<Employee> getEmployees() {
        return employeeRepository.findAll();
    }

    @Override
    public Optional<Employee> getEmployeeById(Long id) {
        return employeeRepository.findById(id);
    }

    @Override
    public Employee updateEmployee(Employee employee) {
        Optional<Employee> optional = employeeRepository.findById(employee.getId());
        if(!optional.isPresent()){
            throw new ApiRequestException(" Employee not found for id :: " + employee.getId());
        }
        employeeRepository.save(employee);
        return employee;
    }

    @Override
    public void deleteEmployee(Long id) { employeeRepository.deleteById(id); }
}
