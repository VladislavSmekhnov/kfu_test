package com.developer.hrmanagement.exception;

/**
 * Exception not found for regions table.
 */

public class RegionNotFoundException extends Exception {
  private final Integer regionId;

  public RegionNotFoundException(Integer regionId) {
    super("Region " + regionId + " not found");
    this.regionId = regionId;
  }

  public Integer getRegionId() {
    return regionId;
  }
}
