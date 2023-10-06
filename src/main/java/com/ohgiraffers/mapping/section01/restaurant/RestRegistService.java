package com.ohgiraffers.mapping.section01.restaurant;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class RestRegistService {

    private RestRepository restRepository;

    public RestRegistService(RestRepository restRepository) {
        this.restRepository = restRepository;
    }

    @Transactional
    public void registRest(RestRegistDTO restInfo) {
        Restaurant restaurant  = new Restaurant(
                restInfo.getRestName(),
                restInfo.getFoodType(),
                restInfo.getFoodMain(),
                restInfo.getScore(),
                restInfo.getAddress(),
                restInfo.getPhone(),
                restInfo.getStatus()
        );

        restRepository.save(restaurant);
    }
}
