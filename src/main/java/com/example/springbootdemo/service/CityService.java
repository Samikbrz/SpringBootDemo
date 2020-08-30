package com.example.springbootdemo.service;

import com.example.springbootdemo.dal.CityDal;
import com.example.springbootdemo.model.City;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.rmi.server.UID;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

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

    public Optional<City> getPersonById(UUID id){
        return cityDal.selectCityById(id);
    }

    public int deleteCity(UUID id){
        return cityDal.deleteCityById(id);
    }

    public int updateCity(UUID id,City city){
        return cityDal.updateCityById(id,city);
    }
}
