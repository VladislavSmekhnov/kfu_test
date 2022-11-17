package com.developer.hrmanagement.service;

import com.developer.hrmanagement.entity.CountriesEntity;
import com.developer.hrmanagement.exception.CountryNotFoundException;
import java.util.List;

/**
 * Countries interface.
 */

public interface CountriesService {
  List<CountriesEntity> findAllCountries();

  CountriesEntity findById(String id) throws CountryNotFoundException;

  CountriesEntity saveCountries(CountriesEntity countryEntity);

  CountriesEntity updateCountries(CountriesEntity countryEntity);

  void deleteCountries(String id);
}
