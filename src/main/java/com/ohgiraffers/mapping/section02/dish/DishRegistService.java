package com.ohgiraffers.mapping.section02.dish;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class DishRegistService {

    private DishRepository dishRepository;

    @Autowired
    public DishRegistService(DishRepository dishRepository) {
        this.dishRepository = dishRepository;
    }

    @Transactional
    public void registDish(DishRegistDTO dishInfo) {
        Dish dish = new Dish(
                dishInfo.getRestName(),
                dishInfo.getDishType(),
                dishInfo.getDishName(),
                dishInfo.getAddress(),
                dishInfo.getReleaseDate(),
                new Price(
                        dishInfo.getRegularPrice(),
                        dishInfo.getDiscountRate()
                )
        );

        dishRepository.save(dish);
    }
}
