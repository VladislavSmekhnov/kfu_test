package com.developer.hrmanagement.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.sun.istack.NotNull;

import javax.persistence.*;
import java.util.Objects;
import java.util.Set;

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

  public DepartmentsEntity() {}

  public DepartmentsEntity(int id, String name, LocationsEntity locationId, Set<EmployeesEntity> employees) {
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
    if (o == null || getClass() != o.getClass()) return false;

    DepartmentsEntity that = (DepartmentsEntity) o;

    if (id != that.id) return false;
    if (!Objects.equals(name, that.name)) return false;
    return Objects.equals(locationId, that.locationId);
  }

  @Override
  public int hashCode() {
    int result = id;
    result = 31 * result + (name != null ? name.hashCode() : 0);
    result = 31 * result + (locationId != null ? locationId.hashCode() : 0);
    return result;
  }
}
