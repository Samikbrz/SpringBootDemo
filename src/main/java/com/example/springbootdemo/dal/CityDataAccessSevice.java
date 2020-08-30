package com.example.springbootdemo.dal;

import com.example.springbootdemo.model.City;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Repository("postgres")
public class CityDataAccessSevice implements CityDal{
    @Override
    public int insertCity(UUID id, City city) {
        return 0;
    }

    @Override
    public List<City> getAllCity() {
        return List.of(new City(UUID.randomUUID(),"FROM POSTGRES DB"));
    }

    @Override
    public Optional<City> selectCityById(UUID id) {
        return Optional.empty();
    }

    @Override
    public int deleteCityById(UUID id) {
        return 0;
    }

    @Override
    public int updateCityById(UUID id, City city) {
        return 0;
    }
}
