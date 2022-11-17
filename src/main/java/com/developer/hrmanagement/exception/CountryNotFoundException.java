package com.developer.hrmanagement.exception;

public class CountryNotFoundException extends Exception {
  private final String countryId;

  public CountryNotFoundException(String countryId) {
    super("Country " + countryId + " not found");
    this.countryId = countryId;
  }

  public String getCountryId() {
    return countryId;
  }
}
