package com.developer.hrmanagement.service;

import com.developer.hrmanagement.entity.CountriesEntity;

import java.util.List;
import java.util.Optional;

public interface CountriesService {
  List<CountriesEntity> findAllCountries();
  Optional<CountriesEntity> findById(String id);
  CountriesEntity saveCountries(CountriesEntity countryEntity);
  CountriesEntity updateCountries(CountriesEntity countryEntity);
  void deleteCountries(String id);
}
