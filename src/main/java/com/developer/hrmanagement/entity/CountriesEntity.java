package com.developer.hrmanagement.entity;

import org.aspectj.lang.annotation.Before;
import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "countries")
public class CountriesEntity {
  @Id
  @Column(name = "id", nullable = false, length = 2)
  private String id;

  @OneToMany(mappedBy = "countryId", cascade = CascadeType.ALL, orphanRemoval = true)
  private Set<LocationsEntity> locations;

  @Column(name = "name", length = 40)
  private String name;

  @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
  // @Cascade(org.hibernate.annotations.CascadeType.SAVE_UPDATE)
  @OnDelete(action = OnDeleteAction.CASCADE)
  @JoinColumn(name = "region_id", nullable = false, insertable = false, updatable = false)
  private RegionsEntity regionId;

  public CountriesEntity() {}

  public CountriesEntity(String id, String name, RegionsEntity regionId) {
    this.id = id;
    this.name = name;
    this.regionId = regionId;
  }

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public RegionsEntity getRegionId() {
    return regionId;
  }

  public void setRegionId(RegionsEntity regionId) {
    this.regionId = regionId;
  }
  public Set<LocationsEntity> getLocations() {
    return locations;
  }

  public void setLocations(Set<LocationsEntity> locations) {
    this.locations = locations;
  }
}
