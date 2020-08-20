package com.example.springbootdemo.dataaccess;

import com.example.springbootdemo.entities.City;
import java.util.List;

public interface ICityDal {
    List<City> getAll();
}
