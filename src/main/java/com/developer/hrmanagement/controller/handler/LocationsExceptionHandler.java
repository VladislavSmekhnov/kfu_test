package com.developer.hrmanagement.controller.handler;

import com.developer.hrmanagement.exception.CountryNotFoundException;
import com.developer.hrmanagement.exception.LocationNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class LocationsExceptionHandler {
  @ExceptionHandler(LocationNotFoundException.class)

  public ResponseEntity<?> handleLocationNotFound(LocationNotFoundException e) {
    return ResponseEntity.status(HttpStatus.NOT_FOUND).body(e.getMessage());
  }
}
