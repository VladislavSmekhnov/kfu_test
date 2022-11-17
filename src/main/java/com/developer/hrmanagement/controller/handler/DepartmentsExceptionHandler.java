package com.developer.hrmanagement.controller.handler;

import com.developer.hrmanagement.exception.DepartmentNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class DepartmentsExceptionHandler {
  @ExceptionHandler(DepartmentNotFoundException.class)
  public ResponseEntity<?> handleCountryNotFound(DepartmentNotFoundException e) {
    return ResponseEntity.status(HttpStatus.NOT_FOUND).body(e.getMessage());
  }
}
