package com.developer.hrmanagement.service.implementation;

import com.developer.hrmanagement.entity.CountriesEntity;
import com.developer.hrmanagement.repository.CountriesRepository;
import com.developer.hrmanagement.service.CountriesService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CountriesImpl implements CountriesService {
  private final CountriesRepository countriesRepository;

  public CountriesImpl(CountriesRepository countriesRepository) {
    this.countriesRepository = countriesRepository;
  }

  @Override
  public List<CountriesEntity> findAllCountries() {
    return countriesRepository.findAll();
  }

  @Override
  public Optional<CountriesEntity> findById(String id) {
    return countriesRepository.findById(id);
  }

  @Override
  public CountriesEntity saveCountries(CountriesEntity countryEntity) {
    return countriesRepository.save(countryEntity);
  }

  @Override
  public CountriesEntity updateCountries(CountriesEntity countryEntity) {
    return countriesRepository.save(countryEntity);
  }

  @Override
  public void deleteCountries(String id) {
    countriesRepository.deleteById(id);
  }
}
