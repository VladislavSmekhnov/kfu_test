package com.developer.hrmanagement.exception;

public class EmployeeNotFoundException extends Exception{
  private final Integer employeeId;

  public EmployeeNotFoundException(Integer employeeId) {
    super("Employee " + employeeId + " not found");
    this.employeeId = employeeId;
  }

  public Integer getEmployeeId() {
    return employeeId;
  }
}
