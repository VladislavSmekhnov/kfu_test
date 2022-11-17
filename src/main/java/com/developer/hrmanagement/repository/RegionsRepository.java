package com.developer.hrmanagement.repository;

import com.developer.hrmanagement.entity.RegionsEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Regions repository.
 */

@Repository
public interface RegionsRepository extends JpaRepository<RegionsEntity, Integer> {
}
