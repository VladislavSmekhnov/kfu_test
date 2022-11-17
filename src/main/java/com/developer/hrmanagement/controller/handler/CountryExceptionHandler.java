package com.developer.hrmanagement.controller.handler;

import com.developer.hrmanagement.exception.CountryNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class CountryExceptionHandler {
  @ExceptionHandler(CountryNotFoundException.class)

  public ResponseEntity<?> handleCountryNotFound(CountryNotFoundException e) {
    return ResponseEntity.status(HttpStatus.NOT_FOUND).body(e.getMessage());
  }
}
