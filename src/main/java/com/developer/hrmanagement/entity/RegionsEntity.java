package com.developer.hrmanagement.entity;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "regions")
public class RegionsEntity {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "id")
  private Integer id;

  @OneToMany(mappedBy = "regionId", cascade = CascadeType.ALL)
  private Set<CountriesEntity> countries;

  @Column(name = "name", length = 25)
  private String name;

  public RegionsEntity(){}
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
}
