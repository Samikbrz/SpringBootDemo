package com.example.springbootdemo.dal;

import com.example.springbootdemo.model.City;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
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

    @Override
    public Optional<City> selectCityById(UUID id) {
        return DB.stream().filter(city -> city.getCityId().equals(id)).findFirst();
    }

    @Override
    public int deleteCityById(UUID id) {
        Optional<City> personMaybe=selectCityById(id);
        if (personMaybe.isEmpty()){
            return 0;
        }
        DB.remove(personMaybe.get());
        return 1;
    }

    @Override
    public int updateCityById(UUID id, City updata) {
       return selectCityById(id).map(city->{
           int indexOfCityToUpdata=DB.indexOf(city);
           if (indexOfCityToUpdata>=0){
               DB.set(indexOfCityToUpdata,new City(id,updata.getCityName()));
               return 1;
           }
           return 0;
       }).orElse(0);
    }
}
