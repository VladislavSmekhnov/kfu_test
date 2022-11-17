package com.developer.hrmanagement.exception;

/**
 * Exception not found for dependents table.
 */

public class DependentNotFoundException extends Exception {
  private final Integer dependentId;

  public DependentNotFoundException(Integer dependentId) {
    super("Dependent " + dependentId + " not found");
    this.dependentId = dependentId;
  }

  public Integer getDependentId() {
    return dependentId;
  }
}
