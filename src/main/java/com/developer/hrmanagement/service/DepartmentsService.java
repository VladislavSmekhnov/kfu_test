package com.developer.hrmanagement.service;

import com.developer.hrmanagement.entity.DepartmentsEntity;

import java.util.List;
import java.util.Optional;

public interface DepartmentsService {
  List<DepartmentsEntity> findAllDepartments();
  Optional<DepartmentsEntity> findById(Integer id);
  DepartmentsEntity saveDepartment(DepartmentsEntity departmentEntity);
  DepartmentsEntity updateDepartment(DepartmentsEntity departmentEntity);
  void deleteDepartment(Integer id);
}
