package com.example.springbootdemo.dal;

import com.example.springbootdemo.model.City;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Repository("cityDal")
public class CityDataAccessService implements CityDal {

    private static List<City> DB=new ArrayList<>();

    @Override
    public int insertCity(UUID id, City city) {
        DB.add(new City(id,city.getCityName()));
        return 1;
    }

    @Override
    public List<City> getAllCity() {
        return DB;
    }
}
