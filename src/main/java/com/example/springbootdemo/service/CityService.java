package com.example.springbootdemo.service;

import com.example.springbootdemo.dal.CityDal;
import com.example.springbootdemo.model.City;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CityService {

    private final CityDal cityDal;

    @Autowired
    public CityService(@Qualifier("cityDal") CityDal cityDal) {
        this.cityDal = cityDal;
    }

    public int addCity(City city){
        return cityDal.insertCity(city);
    }

    public List<City> getAllCity(){
        return  cityDal.getAllCity();
    }
}
