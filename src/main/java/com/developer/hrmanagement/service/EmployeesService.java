package com.developer.hrmanagement.service;

import com.developer.hrmanagement.entity.EmployeesEntity;

import java.util.List;
import java.util.Optional;

public interface EmployeesService {
  List<EmployeesEntity> findAllEmployees();
  Optional<EmployeesEntity> findById(Integer id);
  EmployeesEntity saveEmployee(EmployeesEntity employeesEntity);
  EmployeesEntity updateEmployee(EmployeesEntity employeesEntity);
  void deleteEmployee(Integer id);
}
