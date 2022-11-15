package com.developer.hrmanagement.entity;

import com.sun.istack.NotNull;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import javax.persistence.*;

@Entity
@Table(name = "departments")
public class DepartmentsEntity {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "id")
  private Integer id;

  @NotNull
  @Column(name = "name", length = 30, nullable = false)
  private String name;

  @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
  @OnDelete(action = OnDeleteAction.CASCADE)
  @JoinColumn(name = "location_id", nullable = false, insertable = false, updatable = false)
  private LocationsEntity locationId;

  public DepartmentsEntity() {}

  public DepartmentsEntity(Integer id, String name, LocationsEntity locationId) {
    this.id = id;
    this.name = name;
    this.locationId = locationId;
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
}
