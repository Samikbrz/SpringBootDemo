package com.example.springbootdemo.Business;

import com.example.springbootdemo.DataAccess.ICityDal;
import com.example.springbootdemo.Entities.City;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class CityManager implements ICityService{

    private ICityDal cityDal;

    @Autowired
    public CityManager(ICityDal cityDal){
        this.cityDal=cityDal;
    }

    @Override
    @Transactional
    public List<City> GetAll() {
        return cityDal.GetAll();
    }
}
