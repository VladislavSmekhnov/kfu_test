package com.developer.hrmanagement.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.sun.istack.NotNull;
import java.util.Objects;
import java.util.Set;
import javax.persistence.*;

/**
 * Entity for locations table.
 */

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

  public LocationsEntity() {
  }

  /**
   * Constructor for creation location entity.
   *
   * @param id location id
   * @param streetAddress street address
   * @param postalCode postal code
   * @param city name of the city
   * @param stateProvince sate name
   * @param countryId country id from countries table
   * @param departments for foreign keys
   */

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
    if (!(o instanceof LocationsEntity)) return false;
    LocationsEntity that = (LocationsEntity) o;
    return Objects.equals(id, that.id) && Objects.equals(streetAddress, that.streetAddress)
            && Objects.equals(postalCode, that.postalCode) && city.equals(that.city)
            && Objects.equals(stateProvince, that.stateProvince) && countryId.equals(that.countryId)
            && Objects.equals(departments, that.departments);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, streetAddress, postalCode, city, stateProvince, countryId, departments);
  }
}
