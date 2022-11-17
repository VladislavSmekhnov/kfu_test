package com.developer.hrmanagement.service;

import com.developer.hrmanagement.entity.LocationsEntity;
import com.developer.hrmanagement.exception.LocationNotFoundException;
import java.util.List;

/**
 * Locations interface.
 */

public interface LocationsService {
  List<LocationsEntity> findAllLocations();

  LocationsEntity findById(Integer id) throws LocationNotFoundException;

  LocationsEntity saveLocation(LocationsEntity locationsEntity);

  LocationsEntity updateLocation(LocationsEntity locationsEntity);

  void deleteLocation(Integer id);
}
