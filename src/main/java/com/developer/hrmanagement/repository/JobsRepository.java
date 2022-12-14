package com.developer.hrmanagement.repository;

import com.developer.hrmanagement.entity.JobsEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Jobs repository.
 */

@Repository
public interface JobsRepository extends JpaRepository<JobsEntity, Integer> {
}
