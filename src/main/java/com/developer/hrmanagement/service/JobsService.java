package com.developer.hrmanagement.service;

import com.developer.hrmanagement.entity.JobsEntity;

import java.util.List;
import java.util.Optional;

public interface JobsService {
  List<JobsEntity> findAllJobs();
  Optional<JobsEntity> findById(Integer id);
  JobsEntity saveJob(JobsEntity jobsEntity);
  JobsEntity updateJob(JobsEntity jobsEntity);
  void deleteJob(Integer id);
}
