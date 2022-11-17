package com.developer.hrmanagement.controller.handler;

import com.developer.hrmanagement.exception.DependentNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * Handler exception for dependents table.
 */

@RestControllerAdvice
public class DependentsExceptionHandler {
  @ExceptionHandler(DependentNotFoundException.class)

  public ResponseEntity<?> handleDependentNotFound(DependentNotFoundException e) {
    return ResponseEntity.status(HttpStatus.NOT_FOUND).body(e.getMessage());
  }
}
