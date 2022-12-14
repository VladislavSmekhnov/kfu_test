package com.developer.hrmanagement.repository;

import com.developer.hrmanagement.entity.LocationsEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Locations repository.
 */

@Repository
public interface LocationsRepository extends JpaRepository<LocationsEntity, Integer> {
}
