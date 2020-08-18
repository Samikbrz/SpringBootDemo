package com.example.springbootdemo.dataAccess;

import com.example.springbootdemo.entities.City;
import java.util.List;

public interface ICityDal {
    List<City> GetAll();
}
