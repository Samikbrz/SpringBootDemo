package com.example.springbootdemo.restapi;

public class CityNotFoundException extends Exception {
    public CityNotFoundException(Long id) {
        super("Could not find city " + id);
    }
}
