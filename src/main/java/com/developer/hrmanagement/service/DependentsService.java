package com.developer.hrmanagement.service;

import com.developer.hrmanagement.entity.DependentsEntity;
import com.developer.hrmanagement.exception.DependentNotFoundException;

import java.util.List;
import java.util.Optional;

public interface DependentsService {
  List<DependentsEntity> findAllDependents();
  DependentsEntity findById(Integer id) throws DependentNotFoundException;
  DependentsEntity saveDependent(DependentsEntity dependentEntity);
  DependentsEntity updateDependent(DependentsEntity dependentEntity);
  void deleteDependent(Integer id);
}
