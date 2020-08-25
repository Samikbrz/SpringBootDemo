package com.example.springbootdemo.restapi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class CityController {

    private final CityRepository cityRepository;

    @Autowired
    public CityController(CityRepository cityRepository) {
        this.cityRepository = cityRepository;
    }

    @GetMapping("/cities")
    public List<City> get(){
        return  cityRepository.findAll();
    }

    @GetMapping("/cities/{id}")
    City one(@PathVariable Long id) throws CityNotFoundException {
        return cityRepository.findById(id)
                .orElseThrow(() -> new CityNotFoundException(id));
    }
}
