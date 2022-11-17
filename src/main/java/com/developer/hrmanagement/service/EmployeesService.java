package com.developer.hrmanagement.service;

import com.developer.hrmanagement.entity.EmployeesEntity;
import com.developer.hrmanagement.exception.EmployeeNotFoundException;

import java.util.List;
import java.util.Optional;

public interface EmployeesService {
  List<EmployeesEntity> findAllEmployees();
  EmployeesEntity findById(Integer id) throws EmployeeNotFoundException;
  EmployeesEntity saveEmployee(EmployeesEntity employeesEntity);
  EmployeesEntity updateEmployee(EmployeesEntity employeesEntity);
  void deleteEmployee(Integer id);
}
