package com.example.springbootdemo.DataAccess;

import com.example.springbootdemo.Entities.City;
import java.util.List;

public interface ICityDal {
    List<City> GetAll();
}
