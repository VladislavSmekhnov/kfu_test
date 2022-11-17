package com.developer.hrmanagement.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Objects;
import java.util.Set;

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

  public JobsEntity() {}

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
    if (o == null || getClass() != o.getClass()) return false;

    JobsEntity that = (JobsEntity) o;

    if (!Objects.equals(id, that.id)) return false;
    if (!Objects.equals(jobTitle, that.jobTitle)) return false;
    if (!Objects.equals(minSalary, that.minSalary))
      return false;
    return Objects.equals(maxSalary, that.maxSalary);
  }

  @Override
  public int hashCode() {
    int result = id;
    result = 31 * result + (jobTitle != null ? jobTitle.hashCode() : 0);
    result = 31 * result + (minSalary != null ? minSalary.hashCode() : 0);
    result = 31 * result + (maxSalary != null ? maxSalary.hashCode() : 0);
    return result;
  }
}
