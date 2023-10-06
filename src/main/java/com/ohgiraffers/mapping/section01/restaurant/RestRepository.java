package com.ohgiraffers.mapping.section01.restaurant;

import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Repository
public class RestRepository {

    @PersistenceContext
    private EntityManager manager;

    public void save(Restaurant restaurant) {
        manager.persist(restaurant);
    }
}
