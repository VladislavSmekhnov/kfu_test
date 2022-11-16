package com.developer.hrmanagement.service.implementation;

import com.developer.hrmanagement.entity.LocationsEntity;
import com.developer.hrmanagement.repository.LocationsRepository;
import com.developer.hrmanagement.service.LocationsService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LocationsImpl implements LocationsService {
  private final LocationsRepository locationsRepository;

  public LocationsImpl(LocationsRepository locationsRepository) {
    this.locationsRepository = locationsRepository;
  }

  @Override
  public List<LocationsEntity> findAllLocations() {
    return locationsRepository.findAll();
  }

  @Override
  public Optional<LocationsEntity> findById(Integer id) {
    return locationsRepository.findById(id);
  }

  @Override
  public LocationsEntity saveLocation(LocationsEntity locationsEntity) {
    return locationsRepository.save(locationsEntity);
  }

  @Override
  public LocationsEntity updateLocation(LocationsEntity locationsEntity) {
    return locationsRepository.save(locationsEntity);
  }

  @Override
  public void deleteLocation(Integer id) {
    locationsRepository.deleteById(id);
  }
}
