package com.developer.hrmanagement.service.implementation;

import com.developer.hrmanagement.entity.JobsEntity;
import com.developer.hrmanagement.exception.JobNotFoundException;
import com.developer.hrmanagement.repository.JobsRepository;
import com.developer.hrmanagement.service.JobsService;
import java.util.List;
import org.springframework.stereotype.Service;

/**
 * Implementation of jobs interface.
 */

@Service
public class JobsImpl implements JobsService {
  private final JobsRepository jobsRepository;

  public JobsImpl(JobsRepository jobsRepository) {
    this.jobsRepository = jobsRepository;
  }

  @Override
  public List<JobsEntity> findAllJobs() {
    return jobsRepository.findAll();
  }

  @Override
  public JobsEntity findById(Integer id) throws JobNotFoundException {
    return jobsRepository.findById(id).orElseThrow(() -> new JobNotFoundException(id));
  }

  @Override
  public JobsEntity saveJob(JobsEntity jobsEntity) {
    return jobsRepository.save(jobsEntity);
  }

  @Override
  public JobsEntity updateJob(JobsEntity jobsEntity) {
    return jobsRepository.save(jobsEntity);
  }

  @Override
  public void deleteJob(Integer id) {
    jobsRepository.deleteById(id);
  }
}
