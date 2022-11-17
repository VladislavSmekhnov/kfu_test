package com.developer.hrmanagement.controller.handler;

import com.developer.hrmanagement.exception.EmployeeNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * Handler exception for employees table.
 */

@RestControllerAdvice
public class EmployeesExceptionHandler {
  @ExceptionHandler(EmployeeNotFoundException.class)

  public ResponseEntity<?> handleEmployeeNotFound(EmployeeNotFoundException e) {
    return ResponseEntity.status(HttpStatus.NOT_FOUND).body(e.getMessage());
  }
}
