package com.example.springbootdemo.business;

import com.example.springbootdemo.entities.City;
import java.util.List;

public interface ICityService {
    List<City> getAll();
}
