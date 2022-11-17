package com.developer.hrmanagement.controller.handler;

import com.developer.hrmanagement.exception.RegionNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * Handler exception for regions table.
 */

@RestControllerAdvice
public class RegionsExceptionHandler {
  @ExceptionHandler(RegionNotFoundException.class)

  public ResponseEntity<?> handleRegionNotFound(RegionNotFoundException e) {
    return ResponseEntity.status(HttpStatus.NOT_FOUND).body(e.getMessage());
  }
}
