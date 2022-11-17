package com.developer.hrmanagement.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import java.math.BigDecimal;
import java.util.Objects;
import java.util.Set;
import javax.persistence.*;

/**
 * Entity for jobs table.
 */

@Entity
@Table(name = "jobs", schema = "public", catalog = "hr_db")
public class JobsEntity {
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Id
  @Column(name = "id")
  private Integer id;

  @Column(name = "job_title", length = 20, nullable = false)
  private String jobTitle;

  @Column(name = "min_salary")
  private BigDecimal minSalary;

  @Column(name = "max_salary")
  private BigDecimal maxSalary;

  @OneToMany(mappedBy = "jobId")
  @JsonIgnore
  private Set<EmployeesEntity> employees;

  public JobsEntity() {
  }

  /**
   * Constructor for creation job entity.
   *
   * @param id id
   * @param jobTitle title
   * @param minSalary minimum salary at the specific job
   * @param maxSalary minimum salary at the specific job
   * @param employees for foreign keys
   */

  public JobsEntity(int id, String jobTitle, BigDecimal minSalary, BigDecimal maxSalary,
                    Set<EmployeesEntity> employees) {
    this.id = id;
    this.jobTitle = jobTitle;
    this.minSalary = minSalary;
    this.maxSalary = maxSalary;
    this.employees = employees;
  }

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getJobTitle() {
    return jobTitle;
  }

  public void setJobTitle(String jobTitle) {
    this.jobTitle = jobTitle;
  }

  public BigDecimal getMinSalary() {
    return minSalary;
  }

  public void setMinSalary(BigDecimal minSalary) {
    this.minSalary = minSalary;
  }

  public BigDecimal getMaxSalary() {
    return maxSalary;
  }

  public void setMaxSalary(BigDecimal maxSalary) {
    this.maxSalary = maxSalary;
  }

  public Set<EmployeesEntity> getEmployees() {
    return employees;
  }

  public void setEmployeesId(Set<EmployeesEntity> employees) {
    this.employees = employees;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (!(o instanceof JobsEntity)) return false;
    JobsEntity that = (JobsEntity) o;
    return Objects.equals(id, that.id) && jobTitle.equals(that.jobTitle)
            && Objects.equals(minSalary, that.minSalary)
            && Objects.equals(maxSalary, that.maxSalary)
            && Objects.equals(employees, that.employees);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, jobTitle, minSalary, maxSalary, employees);
  }
}
