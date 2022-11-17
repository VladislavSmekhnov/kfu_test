package com.developer.hrmanagement.controller;

import com.developer.hrmanagement.entity.DependentsEntity;
import com.developer.hrmanagement.exception.DependentNotFoundException;
import com.developer.hrmanagement.service.DependentsService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/dependents")
public class DependentsController {
  private final DependentsService dependentsService;

  public DependentsController(DependentsService dependentsService) {
    this.dependentsService = dependentsService;
  }

  @GetMapping
  public List<DependentsEntity> findAllDependents() {
    return dependentsService.findAllDependents();
  }

  @GetMapping("/{id}")
  public DependentsEntity findDependentById(@PathVariable("id") Integer id) throws DependentNotFoundException {
    return dependentsService.findById(id);
  }

  @PostMapping
  public DependentsEntity saveDependent(@RequestBody DependentsEntity dependentEntity) {
    return dependentsService.saveDependent(dependentEntity);
  }

  @PutMapping
  public DependentsEntity updateDependent(@RequestBody DependentsEntity dependentEntity) {
    return dependentsService.updateDependent(dependentEntity);
  }

  @DeleteMapping("/{id}")
  public void deleteDependent(@PathVariable("id") Integer id) {
    dependentsService.deleteDependent(id);
  }
}
