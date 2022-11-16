package com.developer.hrmanagement.controller;


import com.developer.hrmanagement.entity.CountriesEntity;
import com.developer.hrmanagement.service.CountriesService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/countries")
public class CountriesController {
  private final CountriesService countriesService;

  public CountriesController(CountriesService countriesService) {
    this.countriesService = countriesService;
  }

  @GetMapping
  public List<CountriesEntity> findAllCountries() {
    return countriesService.findAllCountries();
  }

  @GetMapping("/{id}")
  public Optional<CountriesEntity> findCountryById(@PathVariable("id") String id) {
    return countriesService.findById(id);
  }

  @PostMapping
  public CountriesEntity saveCountry(@RequestBody CountriesEntity countrieEntity) {
    return countriesService.saveCountries(countrieEntity);
  }

  @PutMapping
  public CountriesEntity updateCountry(@RequestBody CountriesEntity countrieEntity) {
    return countriesService.updateCountries(countrieEntity);
  }

  @DeleteMapping("/{id}")
  public void deleteCountry(@PathVariable("id") String id) {
    countriesService.deleteCountries(id);
  }
}
