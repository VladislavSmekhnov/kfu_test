package com.developer.hrmanagement.repository;

import com.developer.hrmanagement.entity.DepartmentsEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentsRepository extends JpaRepository<DepartmentsEntity, Integer> {
}
