package com.ohgiraffers.mapping.section02.dish;

import java.time.LocalDate;

public class DishRegistDTO {

    private String restName;
    private String dishType;
    private String dishName;
    private String address;
    private LocalDate releaseDate;
    private int regularPrice;
    private double discountRate;

    public DishRegistDTO() {}

    public DishRegistDTO(String restName, String dishType, String dishName, String address, LocalDate releaseDate, int regularPrice, double discountRate) {
        this.restName = restName;
        this.dishType = dishType;
        this.dishName = dishName;
        this.address = address;
        this.releaseDate = releaseDate;
        this.regularPrice = regularPrice;
        this.discountRate = discountRate;
    }

    public String getRestName() {
        return restName;
    }

    public void setRestName(String restName) {
        this.restName = restName;
    }

    public String getDishType() {
        return dishType;
    }

    public void setDishType(String dishType) {
        this.dishType = dishType;
    }

    public String getDishName() {
        return dishName;
    }

    public void setDishName(String dishName) {
        this.dishName = dishName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public LocalDate getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(LocalDate releaseDate) {
        this.releaseDate = releaseDate;
    }

    public int getRegularPrice() {
        return regularPrice;
    }

    public void setRegularPrice(int regularPrice) {
        this.regularPrice = regularPrice;
    }

    public double getDiscountRate() {
        return discountRate;
    }

    public void setDiscountRate(double discountRate) {
        this.discountRate = discountRate;
    }

    @Override
    public String toString() {
        return "DishRegistDTO{" +
                "restName='" + restName + '\'' +
                ", dishType='" + dishType + '\'' +
                ", dishName='" + dishName + '\'' +
                ", address='" + address + '\'' +
                ", releaseDate=" + releaseDate +
                ", regularPrice=" + regularPrice +
                ", discountRate=" + discountRate +
                '}';
    }
}
