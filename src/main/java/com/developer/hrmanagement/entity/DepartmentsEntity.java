package com.developer.hrmanagement.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.sun.istack.NotNull;
import java.util.Objects;
import java.util.Set;
import javax.persistence.*;

/**
 * Entity for departments table.
 */

@Entity
@Table(name = "departments", schema = "public", catalog = "hr_db")
public class DepartmentsEntity {
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Id
  @Column(name = "id")
  private Integer id;

  @NotNull
  @Column(name = "name", length = 30, nullable = false)
  private String name;

  @ManyToOne
  @JoinColumn(name = "location_id", referencedColumnName = "id")
  private LocationsEntity locationId;

  @OneToMany(mappedBy = "departmentId")
  @JsonIgnore
  private Set<EmployeesEntity> employees;

  public DepartmentsEntity() {
  }

  /**
   * Constructor for creation departments entity.
   *
   * @param id         id
   * @param name       department name
   * @param locationId foreign key
   * @param employees  for foreign key
   */

  public DepartmentsEntity(int id, String name, LocationsEntity locationId,
                           Set<EmployeesEntity> employees) {
    this.id = id;
    this.name = name;
    this.locationId = locationId;
    this.employees = employees;
  }

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public LocationsEntity getLocationId() {
    return locationId;
  }

  public void setLocationId(LocationsEntity locationId) {
    this.locationId = locationId;
  }

  public Set<EmployeesEntity> getEmployees() {
    return employees;
  }

  public void setEmployees(Set<EmployeesEntity> employees) {
    this.employees = employees;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (!(o instanceof DepartmentsEntity)) return false;
    DepartmentsEntity that = (DepartmentsEntity) o;
    return Objects.equals(id, that.id) && name.equals(that.name)
            && Objects.equals(locationId, that.locationId)
            && Objects.equals(employees, that.employees);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, locationId, employees);
  }
}
