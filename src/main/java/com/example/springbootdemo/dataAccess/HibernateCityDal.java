package com.example.springbootdemo.dataAccess;

import com.example.springbootdemo.entities.City;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;
import java.util.List;

@Repository
public class HibernateCityDal implements ICityDal{

    private EntityManager entityManager;

    public HibernateCityDal() {
    }

    @Autowired
    public HibernateCityDal(EntityManager entityManager) {
        this.entityManager=entityManager;
    }

    @Override
    @Transactional
    public List<City> GetAll() {
        Session session=entityManager.unwrap(Session.class);
        List<City> cities=session.createQuery("from City",City.class).getResultList();
        return  cities;
    }
}
