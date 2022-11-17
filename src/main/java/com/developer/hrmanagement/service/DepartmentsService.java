package com.developer.hrmanagement.service;

import com.developer.hrmanagement.entity.DepartmentsEntity;
import com.developer.hrmanagement.exception.DepartmentNotFoundException;
import java.util.List;

/**
 * Departments interface.
 */

public interface DepartmentsService {
  List<DepartmentsEntity> findAllDepartments();

  DepartmentsEntity findById(Integer id) throws DepartmentNotFoundException;

  DepartmentsEntity saveDepartment(DepartmentsEntity departmentEntity);

  DepartmentsEntity updateDepartment(DepartmentsEntity departmentEntity);

  void deleteDepartment(Integer id);
}
