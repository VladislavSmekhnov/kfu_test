package com.developer.hrmanagement.controller;


import com.developer.hrmanagement.entity.CountriesEntity;
import com.developer.hrmanagement.exception.CountryNotFoundException;
import com.developer.hrmanagement.service.CountriesService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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
  public CountriesEntity findCountryById(@PathVariable("id") String id) throws CountryNotFoundException {
    return countriesService.findById(id);
  }

  @PostMapping
  public CountriesEntity saveCountry(@RequestBody CountriesEntity countriesEntity) {
    return countriesService.saveCountries(countriesEntity);
  }

  @PutMapping
  public CountriesEntity updateCountry(@RequestBody CountriesEntity countriesEntity) {
    return countriesService.updateCountries(countriesEntity);
  }

  @DeleteMapping("/{id}")
  public void deleteCountry(@PathVariable("id") String id) {
    countriesService.deleteCountries(id);
  }
}
