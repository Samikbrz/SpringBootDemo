package com.example.springbootdemo.restapi;

import javax.persistence.*;

@Entity
//@Table(name="city")
public class City {
    @Id
    @Column(name = "cityid")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long cityId;

    @Column(name = "cityname")
    private String cityName;

    public City(){}

    public City(int cityId, String cityName) {
        this.cityId = cityId;
        this.cityName = cityName;
    }

    public long getCityId() {
        return cityId;
    }

    public void setCityId(int cityId) {
        this.cityId = cityId;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }
}
