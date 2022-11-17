package com.developer.hrmanagement.controller.handler;

import com.developer.hrmanagement.exception.JobNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class JobsExceptionHandler {
  @ExceptionHandler(JobNotFoundException.class)

  public ResponseEntity<?> handleJobNotFound(JobNotFoundException e) {
    return ResponseEntity.status(HttpStatus.NOT_FOUND).body(e.getMessage());
  }
}
