package com.developer.hrmanagement.exception;

public class LocationNotFoundException extends Exception{
  private final Integer locationId;

  public LocationNotFoundException(Integer locationId) {
    super("Location " + locationId + " not found");
    this.locationId = locationId;
  }

  public Integer getLocationId() {
    return locationId;
  }
}
