package com.developer.hrmanagement.service.implementation;

import com.developer.hrmanagement.entity.DepartmentsEntity;
import com.developer.hrmanagement.exception.DepartmentNotFoundException;
import com.developer.hrmanagement.repository.DepartmentsRepository;
import com.developer.hrmanagement.service.DepartmentsService;
import java.util.List;
import org.springframework.stereotype.Service;

/**
 * Implementation of departments interface.
 */

@Service
public class DepartmentsImpl implements DepartmentsService {
  private final DepartmentsRepository departmentsRepository;

  public DepartmentsImpl(DepartmentsRepository departmentsRepository) {
    this.departmentsRepository = departmentsRepository;
  }

  @Override
  public List<DepartmentsEntity> findAllDepartments() {
    return departmentsRepository.findAll();
  }

  @Override
  public DepartmentsEntity findById(Integer id) throws DepartmentNotFoundException {
    return departmentsRepository.findById(id).orElseThrow(() ->
            new DepartmentNotFoundException(id));
  }

  @Override
  public DepartmentsEntity saveDepartment(DepartmentsEntity departmentEntity) {
    return departmentsRepository.save(departmentEntity);
  }

  @Override
  public DepartmentsEntity updateDepartment(DepartmentsEntity departmentEntity) {
    return departmentsRepository.save(departmentEntity);
  }

  @Override
  public void deleteDepartment(Integer id) {
    departmentsRepository.deleteById(id);
  }
}
