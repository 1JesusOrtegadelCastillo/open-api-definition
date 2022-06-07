package com.example.crudfeature.controller;

import com.example.crudfeature.exception.ApiRequestException;
import com.example.crudfeature.model.Employee;
import com.example.crudfeature.service.EmployeeService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@AllArgsConstructor
@RequestMapping("/employee")
public class EmployeeController {

  private final EmployeeService employeeService;

  //@GetMapping("/employee")
  //public List<Employee> getEmployee(EmployeeService employeeService) {
  //  //throw new ApiRequestException("testing custom exception");
  //  List<Employee> employees = employeeService.getEmployees();
  //  return employees;
  //}

  @PostMapping
  public Employee newEmployee(@RequestBody Employee employee){
    return employeeService.newEmployee(employee);
  }

  @GetMapping
  public ResponseEntity<List<Employee>> Employee(){
    return  ResponseEntity.ok(employeeService.getEmployees());
  }

  @GetMapping("/{id}")
  public ResponseEntity<Employee> employeeById(@PathVariable Long id ){
    return ResponseEntity.of(employeeService.getEmployeeById(id));
  }

  @PutMapping
  public ResponseEntity<Employee> updateEmployee(@RequestBody Employee employee){
    return ResponseEntity.ok(employeeService.updateEmployee(employee));
  }

}
