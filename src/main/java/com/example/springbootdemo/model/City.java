package com.example.springbootdemo.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.sun.istack.NotNull;

import java.util.UUID;

public class City {
    private UUID cityId;

    @NotNull
    private String cityName;

    public City(@JsonProperty("cityId") UUID cityId, @JsonProperty("cityName") String cityName) {
        this.cityId = cityId;
        this.cityName = cityName;
    }

    public UUID getCityId() {
        return cityId;
    }

    public String getCityName() {
        return cityName;
    }
}
