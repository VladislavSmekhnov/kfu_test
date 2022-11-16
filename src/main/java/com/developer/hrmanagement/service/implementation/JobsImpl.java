package com.developer.hrmanagement.service.implementation;

import com.developer.hrmanagement.entity.JobsEntity;
import com.developer.hrmanagement.repository.JobsRepository;
import com.developer.hrmanagement.service.JobsService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

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
  public Optional<JobsEntity> findById(Integer id) {
    return jobsRepository.findById(id);
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
