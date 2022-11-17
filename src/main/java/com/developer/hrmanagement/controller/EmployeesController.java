package com.developer.hrmanagement.controller;

import com.developer.hrmanagement.entity.EmployeesEntity;
import com.developer.hrmanagement.exception.EmployeeNotFoundException;
import com.developer.hrmanagement.service.EmployeesService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/employees")
public class EmployeesController {
  private final EmployeesService employeesService;

  public EmployeesController(EmployeesService employeesService) {
    this.employeesService = employeesService;
  }

  @GetMapping
  public List<EmployeesEntity> findAllEmployees() {
    return employeesService.findAllEmployees();
  }

  @GetMapping("/{id}")
  public EmployeesEntity findEmployeeById(@PathVariable("id") Integer id) throws EmployeeNotFoundException {
    return employeesService.findById(id);
  }

  @PostMapping
  public EmployeesEntity saveEmployee(@RequestBody EmployeesEntity employeeEntity) {
    return employeesService.saveEmployee(employeeEntity);
  }

  @PutMapping
  public EmployeesEntity updateEmployee(@RequestBody EmployeesEntity employeeEntity) {
    return employeesService.updateEmployee(employeeEntity);
  }

  @DeleteMapping("/{id}")
  public void deleteEmployee(@PathVariable("id") Integer id) {
    employeesService.deleteEmployee(id);
  }
}
