package com.developer.hrmanagement.service.implementation;

import com.developer.hrmanagement.entity.DependentsEntity;
import com.developer.hrmanagement.repository.DependentsRepository;
import com.developer.hrmanagement.service.DependentsService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DependentsImpl implements DependentsService {
  private final DependentsRepository dependentsRepository;

  public DependentsImpl(DependentsRepository dependentsRepository) {
    this.dependentsRepository = dependentsRepository;
  }

  @Override
  public List<DependentsEntity> findAllDependents() {
    return dependentsRepository.findAll();
  }

  @Override
  public Optional<DependentsEntity> findById(Integer id) {
    return dependentsRepository.findById(id);
  }

  @Override
  public DependentsEntity saveDependent(DependentsEntity dependentEntity) {
    return dependentsRepository.save(dependentEntity);
  }

  @Override
  public DependentsEntity updateDependent(DependentsEntity dependentEntity) {
    return dependentsRepository.save(dependentEntity);
  }

  @Override
  public void deleteDependent(Integer id) {
    dependentsRepository.deleteById(id);
  }
}
