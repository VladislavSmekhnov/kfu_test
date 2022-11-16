package com.developer.hrmanagement.controller;

import com.developer.hrmanagement.entity.LocationsEntity;
import com.developer.hrmanagement.service.LocationsService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/locations")
public class LocationsController {
  private final LocationsService locationsService;

  public LocationsController(LocationsService locationsService) {
    this.locationsService = locationsService;
  }

  @GetMapping
  public List<LocationsEntity> findAllLocations() {
    return locationsService.findAllLocations();
  }

  @GetMapping("/{id}")
  public Optional<LocationsEntity> findLocationById(@PathVariable("id") Integer id) {
    return locationsService.findById(id);
  }

  @PostMapping
  public LocationsEntity saveLocation(@RequestBody LocationsEntity locationEntity) {
    return locationsService.saveLocation(locationEntity);
  }

  @PutMapping
  public LocationsEntity updateLocation(@RequestBody LocationsEntity locationEntity) {
    return locationsService.updateLocation(locationEntity);
  }

  @DeleteMapping("/{id}")
  public void deleteLocation(@PathVariable("id") Integer id) {
    locationsService.deleteLocation(id);
  }
}
