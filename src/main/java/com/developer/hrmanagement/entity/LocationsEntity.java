package com.developer.hrmanagement.entity;

import com.sun.istack.NotNull;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "locations")
public class LocationsEntity {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "id")
  private Integer id;

  @OneToMany(mappedBy = "locationId", cascade = CascadeType.ALL, orphanRemoval = true)
  private Set<DepartmentsEntity> departments;

  @Column(name = "street_address", length = 40)
  private String streetAddress;
  @Column(name = "postal_code", length = 12)
  private String postalCode;

  @NotNull
  @Column(name = "city", length = 30, nullable = false)
  private String city;
  @Column(name = "state_province", length = 25)
  private String stateProvince;

  @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
  @OnDelete(action = OnDeleteAction.CASCADE)
  @JoinColumn(name = "country_id", nullable = false, insertable = false, updatable = false)
  private CountriesEntity countryId;

  public LocationsEntity() {}

  public LocationsEntity(Integer id, String streetAddress, String postalCode, String city,
                         String stateProvince, CountriesEntity countryId) {
    this.id = id;
    this.streetAddress = streetAddress;
    this.postalCode = postalCode;
    this.city = city;
    this.stateProvince = stateProvince;
    this.countryId = countryId;
  }

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getStreetAddress() {
    return streetAddress;
  }

  public void setStreetAddress(String streetAddress) {
    this.streetAddress = streetAddress;
  }

  public String getPostalCode() {
    return postalCode;
  }

  public void setPostalCode(String postalCode) {
    this.postalCode = postalCode;
  }

  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public String getStateProvince() {
    return stateProvince;
  }

  public void setStateProvince(String stateProvince) {
    this.stateProvince = stateProvince;
  }

  public CountriesEntity getCountryId() {
    return countryId;
  }

  public void setCountryId(CountriesEntity countryId) {
    this.countryId = countryId;
  }
}
