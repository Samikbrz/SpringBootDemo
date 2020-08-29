package com.example.springbootdemo.api;

import com.example.springbootdemo.model.City;
import com.example.springbootdemo.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/city")
public class CityController {

    private final CityService cityService;

    @Autowired
    public CityController(CityService cityService) {
        this.cityService = cityService;
    }

    @PostMapping
    public void addCity(@RequestBody City city){
        cityService.addCity(city);
    }

    @GetMapping
    public List<City> getAllCity(){
        return cityService.getAllCity();
    }
}
