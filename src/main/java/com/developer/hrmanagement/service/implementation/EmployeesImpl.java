package com.developer.hrmanagement.service.implementation;

import com.developer.hrmanagement.entity.EmployeesEntity;
import com.developer.hrmanagement.repository.EmployeesRepository;
import com.developer.hrmanagement.service.EmployeesService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

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
  public Optional<EmployeesEntity> findById(Integer id) {
    return employeesRepository.findById(id);
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