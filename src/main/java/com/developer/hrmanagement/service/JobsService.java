package com.developer.hrmanagement.service;

import com.developer.hrmanagement.entity.JobsEntity;
import com.developer.hrmanagement.exception.JobNotFoundException;

import java.util.List;
import java.util.Optional;

public interface JobsService {
  List<JobsEntity> findAllJobs();
  JobsEntity findById(Integer id) throws JobNotFoundException;
  JobsEntity saveJob(JobsEntity jobsEntity);
  JobsEntity updateJob(JobsEntity jobsEntity);
  void deleteJob(Integer id);
}
