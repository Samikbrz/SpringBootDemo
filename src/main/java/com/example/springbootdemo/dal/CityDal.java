package com.example.springbootdemo.dal;

import com.example.springbootdemo.model.City;

import java.util.List;
import java.util.UUID;

public interface CityDal {

    int insertCity(UUID id, City city);

    default int insertCity(City city){
        UUID id=UUID.randomUUID();
        return insertCity(id,city);
    }

    List<City> getAllCity();
}
