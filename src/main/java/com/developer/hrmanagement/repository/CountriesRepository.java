package com.developer.hrmanagement.repository;

import com.developer.hrmanagement.entity.CountriesEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CountriesRepository extends JpaRepository<CountriesEntity, String> {
}
