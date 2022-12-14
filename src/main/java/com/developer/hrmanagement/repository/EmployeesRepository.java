package com.developer.hrmanagement.repository;

import com.developer.hrmanagement.entity.EmployeesEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Employees repository.
 */

@Repository
public interface EmployeesRepository extends JpaRepository<EmployeesEntity, Integer> {
}
