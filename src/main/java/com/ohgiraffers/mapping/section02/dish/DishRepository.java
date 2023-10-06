package com.ohgiraffers.mapping.section02.dish;

import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Repository
public class DishRepository {

    @PersistenceContext
    private EntityManager manager;

    public void save(Dish dish) {
        manager.persist(dish);
    }
}
