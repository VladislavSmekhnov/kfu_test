package com.developer.hrmanagement.service;

import com.developer.hrmanagement.entity.LocationsEntity;

import java.util.List;
import java.util.Optional;

public interface LocationsService {
  List<LocationsEntity> findAllLocations();
  Optional<LocationsEntity> findById(Integer id);
  LocationsEntity saveLocation(LocationsEntity locationsEntity);
  LocationsEntity updateLocation(LocationsEntity locationsEntity);
  void deleteLocation(Integer id);
}
