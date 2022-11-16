package com.developer.hrmanagement.service;

import com.developer.hrmanagement.entity.DependentsEntity;

import java.util.List;
import java.util.Optional;

public interface DependentsService {
  List<DependentsEntity> findAllDependents();
  Optional<DependentsEntity> findById(Integer id);
  DependentsEntity saveDependent(DependentsEntity dependentEntity);
  DependentsEntity updateDependent(DependentsEntity dependentEntity);
  void deleteDependent(Integer id);
}
