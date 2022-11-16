package com.developer.hrmanagement.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "dependents", schema = "public", catalog = "hr_db")
public class DependentsEntity {
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Id
  @Column(name = "id")
  private Integer id;

  @Column(name = "first_name", length = 50, nullable = false)
  private String firstName;

  @Column(name = "last_name", length = 50, nullable = false)
  private String lastName;

  @Column(name = "relationship", length = 25)
  private String relationship;

  @ManyToOne
  @JoinColumn(name = "employee_id", referencedColumnName = "id", nullable = false)
  private EmployeesEntity employeeId;

  public DependentsEntity() {}

  public DependentsEntity(int id, String firstName, String lastName, String relationship,
                          EmployeesEntity employeeId) {
    this.id = id;
    this.firstName = firstName;
    this.lastName = lastName;
    this.relationship = relationship;
    this.employeeId = employeeId;
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

  public String getRelationship() {
    return relationship;
  }

  public void setRelationship(String relationship) {
    this.relationship = relationship;
  }

  public EmployeesEntity getEmployeeId() {
    return employeeId;
  }

  public void setEmployeeId(EmployeesEntity employeeId) {
    this.employeeId = employeeId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;

    DependentsEntity that = (DependentsEntity) o;

    if (id != that.id) return false;
    if (employeeId != that.employeeId) return false;
    if (!Objects.equals(firstName, that.firstName))
      return false;
    if (!Objects.equals(lastName, that.lastName)) return false;
    return Objects.equals(relationship, that.relationship);
  }

//  @Override
//  public boolean equals(Object o) {
//    if (this == o) return true;
//    if (!(o instanceof DependentsEntity)) return false;
//    DependentsEntity that = (DependentsEntity) o;
//    return id == that.id && firstName.equals(that.firstName) && lastName.equals(that.lastName) && relationship.equals(that.relationship) && employeeId.equals(that.employeeId);
//  }

  @Override
  public int hashCode() {
    return Objects.hash(id, firstName, lastName, relationship, employeeId);
  }


//  @Override
//  public int hashCode() {
//    int result = id;
//    result = 31 * result + (firstName != null ? firstName.hashCode() : 0);
//    result = 31 * result + (lastName != null ? lastName.hashCode() : 0);
//    result = 31 * result + (relationship != null ? relationship.hashCode() : 0);
//    result = 31 * result + employeeId;
//    return result;
//  }

}
