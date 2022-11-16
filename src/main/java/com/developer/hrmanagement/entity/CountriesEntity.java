package com.developer.hrmanagement.entity;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import javax.persistence.*;
import java.util.Objects;
import java.util.Set;

@Entity
@Table(name = "countries", schema = "public", catalog = "hr_db")
public class CountriesEntity {
  @Id
  @Column(name = "id", columnDefinition="CHAR(2)", length = 2)
  private String id;

  @Column(name = "name", length = 40)
  private String name;

  @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
  @OnDelete(action = OnDeleteAction.CASCADE)
  @JoinColumn(name = "region_id", referencedColumnName = "id", nullable = false)
  private RegionsEntity regionId;

  @OneToMany(mappedBy = "countryId", cascade = CascadeType.ALL, orphanRemoval = true)
  private Set<LocationsEntity> locations;

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

//  @Override
//  public boolean equals(Object o) {
//    if (this == o) return true;
//    if (!(o instanceof CountriesEntity)) return false;
//    CountriesEntity that = (CountriesEntity) o;
//    return id.equals(that.id) && Objects.equals(name, that.name) && regionId.equals(that.regionId) && Objects.equals(locations, that.locations);
//  }
//
  @Override
  public int hashCode() {
    return Objects.hash(id, name, regionId, locations);
  }

//    @Override
//  public int hashCode() {
//    int result = id != null ? id.hashCode() : 0;
//    result = 31 * result + (name != null ? name.hashCode() : 0);
//    result = 31 * result + regionId;
//    return result;
//  }

    @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;

    CountriesEntity that = (CountriesEntity) o;

    if (regionId != that.regionId) return false;
    if (!Objects.equals(id, that.id)) return false;
    return Objects.equals(name, that.name);
  }
}
