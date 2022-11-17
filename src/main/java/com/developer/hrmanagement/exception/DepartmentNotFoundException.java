package com.developer.hrmanagement.exception;

/**
 * Exception not found for departments table.
 */

public class DepartmentNotFoundException extends Exception {
  private final Integer departmentId;

  public DepartmentNotFoundException(Integer departmentId) {
    super("Department " + departmentId + " not found");
    this.departmentId = departmentId;
  }

  public Integer getDepartmentId() {
    return departmentId;
  }
}
