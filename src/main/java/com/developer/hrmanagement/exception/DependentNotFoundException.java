package com.developer.hrmanagement.exception;

public class DependentNotFoundException extends Exception{
  private final Integer dependentId;

  public DependentNotFoundException(Integer dependentId) {
    super("Dependent " + dependentId + " not found");
    this.dependentId = dependentId;
  }

  public Integer getDependentId() {
    return dependentId;
  }
}
