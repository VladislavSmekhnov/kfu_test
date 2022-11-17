package com.developer.hrmanagement.service.implementation;

import com.developer.hrmanagement.entity.EmployeesEntity;
import com.developer.hrmanagement.exception.EmployeeNotFoundException;
import com.developer.hrmanagement.repository.EmployeesRepository;
import com.developer.hrmanagement.service.EmployeesService;
import java.util.List;
import org.springframework.stereotype.Service;

/**
 * Implementation of employees interface.
 */

@Service
public class EmployeesImpl implements EmployeesService {
  private final EmployeesRepository employeesRepository;

  public EmployeesImpl(EmployeesRepository employeesRepository) {
    this.employeesRepository = employeesRepository;
  }

  @Override
  public List<EmployeesEntity> findAllEmployees() {
    return employeesRepository.findAll();
  }

  @Override
  public EmployeesEntity findById(Integer id) throws EmployeeNotFoundException {
    return employeesRepository.findById(id).orElseThrow(() -> new EmployeeNotFoundException(id));
  }

  @Override
  public EmployeesEntity saveEmployee(EmployeesEntity employeesEntity) {
    return employeesRepository.save(employeesEntity);
  }

  @Override
  public EmployeesEntity updateEmployee(EmployeesEntity employeesEntity) {
    return employeesRepository.save(employeesEntity);
  }

  @Override
  public void deleteEmployee(Integer id) {
    employeesRepository.deleteById(id);
  }
}
