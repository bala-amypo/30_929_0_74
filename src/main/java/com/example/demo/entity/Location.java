package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Location {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
    private String name;
    private Double latiude;
    private Double longitude;
public Location() {
    }
public Location(Long id, String name, Double latiude, Double longitude) {
        this.id = id;
        this.name = name;
        this.latiude = latiude;
        this.longitude = longitude;
    }
public Long getId() {
    return id;
}
public void setId(Long id) {
    this.id = id;
}
public String getName() {
    return name;
}
public void setName(String name) {
    this.name = name;
}
public Double getLatiude() {
    return latiude;
}
public void setLatiude(Double latiude) {
    this.latiude = latiude;
}
public Double getLongitude() {
    return longitude;
}
public void setLongitude(Double longitude) {
    this.longitude = longitude;
}

}
