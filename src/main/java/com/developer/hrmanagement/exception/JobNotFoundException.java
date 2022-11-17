package com.developer.hrmanagement.exception;

/**
 * Exception not found for jobs table.
 */

public class JobNotFoundException extends Exception {
  private final Integer jobId;

  public JobNotFoundException(Integer jobId) {
    super("Job " + jobId + " not found");
    this.jobId = jobId;
  }

  public Integer getJobId() {
    return jobId;
  }
}
