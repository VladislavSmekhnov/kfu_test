package com.developer.hrmanagement.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.Objects;
import java.util.Set;
import javax.persistence.*;

/**
 * Entity for regions table.
 */

@Entity
@Table(name = "regions", schema = "public", catalog = "hr_db")
public class RegionsEntity {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "id")
  private Integer id;

  @OneToMany(mappedBy = "regionId")
  @JsonIgnore
  private Set<CountriesEntity> countries;

  @Column(name = "name", length = 25)
  private String name;

  public RegionsEntity() {
  }

  public RegionsEntity(Integer id, String name) {
    this.id = id;
    this.name = name;
  }

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public Set<CountriesEntity> getCountries() {
    return countries;
  }

  public void setCountries(Set<CountriesEntity> countries) {
    this.countries = countries;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (!(o instanceof RegionsEntity)) return false;
    RegionsEntity that = (RegionsEntity) o;
    return Objects.equals(id, that.id) && Objects.equals(countries, that.countries)
            && Objects.equals(name, that.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, countries, name);
  }
}
