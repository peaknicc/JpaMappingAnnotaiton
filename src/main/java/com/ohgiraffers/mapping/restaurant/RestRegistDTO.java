package com.ohgiraffers.mapping.restaurant;

public class RestRegistDTO {

    private String restName;
    private String foodType;
    private String foodMain;
    private int score;
    private String address;
    private String phone;
    private String status;

    public RestRegistDTO() {
    }

    public RestRegistDTO(String restName, String foodType, String foodMain, int score, String address, String phone, String status) {
        this.restName = restName;
        this.foodType = foodType;
        this.foodMain = foodMain;
        this.score = score;
        this.address = address;
        this.phone = phone;
        this.status = status;
    }

    public String getRestName() {
        return restName;
    }

    public void setRestName(String restName) {
        this.restName = restName;
    }

    public String getFoodType() {
        return foodType;
    }

    public void setFoodType(String foodType) {
        this.foodType = foodType;
    }

    public String getFoodMain() {
        return foodMain;
    }

    public void setFoodMain(String foodMain) {
        this.foodMain = foodMain;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "RestRegistDTO{" +
                "restName='" + restName + '\'' +
                ", foodType='" + foodType + '\'' +
                ", foodMain='" + foodMain + '\'' +
                ", score=" + score +
                ", address='" + address + '\'' +
                ", phone='" + phone + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}
