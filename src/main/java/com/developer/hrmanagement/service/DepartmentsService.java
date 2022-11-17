package com.developer.hrmanagement.service;

import com.developer.hrmanagement.entity.DepartmentsEntity;
import com.developer.hrmanagement.exception.DepartmentNotFoundException;

import java.util.List;
import java.util.Optional;

public interface DepartmentsService {
  List<DepartmentsEntity> findAllDepartments();
  public DepartmentsEntity findById(Integer id) throws DepartmentNotFoundException;
  DepartmentsEntity saveDepartment(DepartmentsEntity departmentEntity);
  DepartmentsEntity updateDepartment(DepartmentsEntity departmentEntity);
  void deleteDepartment(Integer id);
}
