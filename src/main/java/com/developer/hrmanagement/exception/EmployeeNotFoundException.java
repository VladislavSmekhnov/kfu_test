package com.developer.hrmanagement.exception;

/**
 * Exception not found for employees table.
 */

public class EmployeeNotFoundException extends Exception {
  private final Integer employeeId;

  public EmployeeNotFoundException(Integer employeeId) {
    super("Employee " + employeeId + " not found");
    this.employeeId = employeeId;
  }

  public Integer getEmployeeId() {
    return employeeId;
  }
}
