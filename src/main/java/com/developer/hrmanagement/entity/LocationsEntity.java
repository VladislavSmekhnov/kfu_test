package com.developer.hrmanagement.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.sun.istack.NotNull;

import javax.persistence.*;
import java.util.Objects;
import java.util.Set;

@Entity
@Table(name = "locations", schema = "public", catalog = "hr_db")
public class LocationsEntity {
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Id
  @Column(name = "id")
  private Integer id;

  @Column(name = "street_address", length = 40)
  private String streetAddress;

  @Column(name = "postal_code", length = 12)
  private String postalCode;

  @NotNull
  @Column(name = "city", length = 30, nullable = false)
  private String city;

  @Column(name = "state_province", length = 25)
  private String stateProvince;

  @ManyToOne
  @JoinColumn(name = "country_id", referencedColumnName = "id", nullable = false)
  private CountriesEntity countryId;

  @OneToMany(mappedBy = "locationId")
  @JsonIgnore
  private Set<DepartmentsEntity> departments;

  public LocationsEntity() {}

  public LocationsEntity(int id, String streetAddress, String postalCode, String city,
                         String stateProvince, CountriesEntity countryId,
                         Set<DepartmentsEntity> departments) {
    this.id = id;
    this.streetAddress = streetAddress;
    this.postalCode = postalCode;
    this.city = city;
    this.stateProvince = stateProvince;
    this.countryId = countryId;
    this.departments = departments;
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

  public Set<DepartmentsEntity> getDepartments() {
    return departments;
  }

  public void setDepartments(Set<DepartmentsEntity> departments) {
    this.departments = departments;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;

    LocationsEntity that = (LocationsEntity) o;

    if (id != that.id) return false;
    if (!Objects.equals(streetAddress, that.streetAddress))
      return false;
    if (!Objects.equals(postalCode, that.postalCode))
      return false;
    if (!Objects.equals(city, that.city)) return false;
    if (!Objects.equals(stateProvince, that.stateProvince))
      return false;
    return Objects.equals(countryId, that.countryId);
  }

  @Override
  public int hashCode() {
    int result = id;
    result = 31 * result + (streetAddress != null ? streetAddress.hashCode() : 0);
    result = 31 * result + (postalCode != null ? postalCode.hashCode() : 0);
    result = 31 * result + (city != null ? city.hashCode() : 0);
    result = 31 * result + (stateProvince != null ? stateProvince.hashCode() : 0);
    result = 31 * result + (countryId != null ? countryId.hashCode() : 0);
    return result;
  }
}
