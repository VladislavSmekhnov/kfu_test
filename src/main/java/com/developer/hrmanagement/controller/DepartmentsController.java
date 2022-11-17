package com.developer.hrmanagement.controller;


import com.developer.hrmanagement.entity.DepartmentsEntity;
import com.developer.hrmanagement.exception.DepartmentNotFoundException;
import com.developer.hrmanagement.service.DepartmentsService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/departments")
public class DepartmentsController {
  private final DepartmentsService departmentsService;

  public DepartmentsController(DepartmentsService departmentsService) {
    this.departmentsService = departmentsService;
  }

  @GetMapping
  public List<DepartmentsEntity> findAllDepartments() {
    return departmentsService.findAllDepartments();
  }

  @GetMapping("/{id}")
  public DepartmentsEntity findDepartmentById(@PathVariable("id") Integer id) throws DepartmentNotFoundException {
    return departmentsService.findById(id);
  }

  @PostMapping
  public DepartmentsEntity saveDepartment(@RequestBody DepartmentsEntity departmentEntity) {
    return departmentsService.saveDepartment(departmentEntity);
  }

  @PutMapping
  public DepartmentsEntity updateDepartment(@RequestBody DepartmentsEntity departmentsEntity) {
    return departmentsService.updateDepartment(departmentsEntity);
  }

  @DeleteMapping("/{id}")
  public void deleteDepartment(@PathVariable("id") Integer id) {
    departmentsService.deleteDepartment(id);
  }
}
