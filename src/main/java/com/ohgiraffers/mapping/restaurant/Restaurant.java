package com.ohgiraffers.mapping.restaurant;

import javax.persistence.*;

@Entity
@Table(name = "restaurant")
public class Restaurant {

    @Id
    @Column(name = "rest_no")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int restNo;
    @Column(name = "rest_name", nullable = false)
    private String restName;
    @Column(name = "food_type", nullable = false)
    private String foodType;
    @Column(name = "food_main", nullable = false)
    private String foodMain;
    @Column(name = "score", nullable = false)
    private int score;
    @Column(name = "address", nullable = false)
    private String address;
    @Column(name = "phone", nullable = false)
    private String phone;
    @Column(name = "status", nullable = false)
    private String status;

    protected Restaurant() {}

    public Restaurant(String restName, String foodType, String foodMain, int score, String address, String phone, String status) {
        this.restName = restName;
        this.foodType = foodType;
        this.foodMain = foodMain;
        this.score = score;
        this.address = address;
        this.phone = phone;
        this.status = status;
    }
}
