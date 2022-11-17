package com.developer.hrmanagement.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import java.math.BigDecimal;
import java.sql.Date;
import java.util.Objects;
import java.util.Set;
import javax.persistence.*;

/**
 * Entity for employees table.
 */

@Entity
@Table(name = "employees", schema = "public", catalog = "hr_db")
public class EmployeesEntity {
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Id
  @Column(name = "id")
  private Integer id;
  private String firstName;
  private String lastName;
  private String email;
  private String phoneNumber;
  private Date hireDate;

  @ManyToOne
  @JoinColumn(name = "job_id", referencedColumnName = "id", nullable = false)
  private JobsEntity jobId;
  private BigDecimal salary;

  @ManyToOne
  @JoinColumn(name = "manager_id", referencedColumnName = "id")
  private EmployeesEntity managerId;

  @OneToMany(mappedBy = "employeeId")
  @JsonIgnore
  private Set<DependentsEntity> dependents;

  @OneToMany(mappedBy = "managerId")
  @JsonIgnore
  private Set<EmployeesEntity> employees;

  @ManyToOne
  @JoinColumn(name = "department_id", referencedColumnName = "id")
  private DepartmentsEntity departmentId;

  public EmployeesEntity() {
  }

  /**
   * Constructor for creation employee entity.
   *
   * @param id id
   * @param firstName employee name
   * @param lastName employee last name
   * @param email email
   * @param phoneNumber phone number
   * @param hireDate hire date
   * @param jobId job id from jobs table
   * @param salary salary amount
   * @param managerId manager id
   * @param dependents for foreign keys
   * @param employees for foreign keys
   * @param departmentId for foreign keys
   */

  public EmployeesEntity(int id, String firstName, String lastName, String email,
                         String phoneNumber, Date hireDate, JobsEntity jobId, BigDecimal salary,
                         EmployeesEntity managerId, Set<DependentsEntity> dependents,
                         Set<EmployeesEntity> employees, DepartmentsEntity departmentId) {
    this.id = id;
    this.firstName = firstName;
    this.lastName = lastName;
    this.email = email;
    this.phoneNumber = phoneNumber;
    this.hireDate = hireDate;
    this.jobId = jobId;
    this.salary = salary;
    this.managerId = managerId;
    this.dependents = dependents;
    this.employees = employees;
    this.departmentId = departmentId;
  }

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getPhoneNumber() {
    return phoneNumber;
  }

  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }

  public Date getHireDate() {
    return hireDate;
  }

  public void setHireDate(Date hireDate) {
    this.hireDate = hireDate;
  }

  public JobsEntity getJobId() {
    return jobId;
  }

  public void setJobId(JobsEntity jobId) {
    this.jobId = jobId;
  }

  public BigDecimal getSalary() {
    return salary;
  }

  public void setSalary(BigDecimal salary) {
    this.salary = salary;
  }

  public EmployeesEntity getManagerId() {
    return managerId;
  }

  public void setManagerId(EmployeesEntity managerId) {
    this.managerId = managerId;
  }

  public Set<DependentsEntity> getDependents() {
    return dependents;
  }

  public void setDependents(Set<DependentsEntity> dependents) {
    this.dependents = dependents;
  }

  public Set<EmployeesEntity> getEmployees() {
    return employees;
  }

  public void setEmployees(Set<EmployeesEntity> employees) {
    this.employees = employees;
  }

  public DepartmentsEntity getDepartmentId() {
    return departmentId;
  }

  public void setDepartmentId(DepartmentsEntity departmentId) {
    this.departmentId = departmentId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (!(o instanceof EmployeesEntity)) return false;
    EmployeesEntity that = (EmployeesEntity) o;
    return Objects.equals(id, that.id) && Objects.equals(firstName, that.firstName)
            && lastName.equals(that.lastName) && email.equals(that.email)
            && Objects.equals(phoneNumber, that.phoneNumber) && hireDate.equals(that.hireDate)
            && jobId.equals(that.jobId) && salary.equals(that.salary)
            && Objects.equals(managerId, that.managerId)
            && Objects.equals(dependents, that.dependents)
            && Objects.equals(employees, that.employees)
            && Objects.equals(departmentId, that.departmentId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, firstName, lastName, email, phoneNumber, hireDate, jobId, salary,
            managerId, dependents, employees, departmentId);
  }
}
