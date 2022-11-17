package com.developer.hrmanagement.controller;

import com.developer.hrmanagement.entity.JobsEntity;
import com.developer.hrmanagement.exception.JobNotFoundException;
import com.developer.hrmanagement.service.JobsService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/jobs")
public class JobsController {
  private final JobsService jobsService;

  public JobsController(JobsService jobsService) {
    this.jobsService = jobsService;
  }
  @GetMapping
  public List<JobsEntity> findAllJobs() {
    return jobsService.findAllJobs();
  }

  @GetMapping("/{id}")
  public JobsEntity findJobById(@PathVariable("id") Integer id) throws JobNotFoundException {
    return jobsService.findById(id);
  }

  @PostMapping
  public JobsEntity saveJob(@RequestBody JobsEntity jobEntity) {
    return jobsService.saveJob(jobEntity);
  }

  @PutMapping
  public JobsEntity updateJob(@RequestBody JobsEntity jobsEntity) {
    return jobsService.updateJob(jobsEntity);
  }

  @DeleteMapping("/{id}")
  public void deleteJob(@PathVariable("id") Integer id) {
    jobsService.deleteJob(id);
  }
}
