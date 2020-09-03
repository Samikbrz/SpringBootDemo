package com.example.springbootdemo.api;

import com.example.springbootdemo.model.City;
import com.example.springbootdemo.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.lang.NonNull;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

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

    @GetMapping(path = "{id}")
    public City getCityById(@PathVariable("id") UUID id){
        return cityService.getPersonById(id).orElse(null);
    }

    @DeleteMapping(path = "{id}")
    public void deleteCityByID(@PathVariable("id") UUID id){
        cityService.deleteCity(id);
    }

    @PutMapping
    public void updateCity(@PathVariable("id")UUID id, @NonNull @RequestBody City city){
        cityService.updateCity(id,city);
    }
}
