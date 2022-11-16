package com.developer.hrmanagement.repository;

import com.developer.hrmanagement.entity.DependentsEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DependentsRepository extends JpaRepository<DependentsEntity, Integer> {
}
