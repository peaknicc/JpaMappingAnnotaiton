package com.ohgiraffers.mapping.section02.dish;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "dish")
public class Dish {

    @Id
    @Column(name = "DISH_NO")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int dishNo;

    @Column(name = "REST_NAME")
    private String restName;
    @Column(name = "DISH_TYPE")
    private String dishType;
    @Column(name = "DISH_NAME")
    private String dishName;
    @Column(name = "ADDRESS")
    private String address;
    @Column(name = "RELEASE_DATE")
    private LocalDate releaseDate;

    @Embedded
    private Price price;

    public Dish() {}

    public Dish(String restName, String dishType, String dishName, String address, LocalDate releaseDate, Price price) {
        this.restName = restName;
        this.dishType = dishType;
        this.dishName = dishName;
        this.address = address;
        this.releaseDate = releaseDate;
        this.price = price;
    }

    public int getDishNo() {
        return dishNo;
    }

    public String getRestName() {
        return restName;
    }

    public String getDishType() {
        return dishType;
    }

    public String getDishName() {
        return dishName;
    }

    public String getAddress() {
        return address;
    }

    public LocalDate getReleaseDate() {
        return releaseDate;
    }

    public Price getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Dish{" +
                "dishNo=" + dishNo +
                ", restName='" + restName + '\'' +
                ", dishType='" + dishType + '\'' +
                ", dishName='" + dishName + '\'' +
                ", address='" + address + '\'' +
                ", releaseDate=" + releaseDate +
                ", price=" + price +
                '}';
    }
}
