package com.developer.hrmanagement.exception;

public class JobNotFoundException extends Exception{
  private final Integer jobId;

  public JobNotFoundException(Integer jobId) {
    super("Job " + jobId + " not found");
    this.jobId = jobId;
  }

  public Integer getJobId() {
    return jobId;
  }
}
