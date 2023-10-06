package com.ohgiraffers.mapping.section02.dish;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class Price {

    @Column(name = "REGULAR_PRICE")
    private int regularPrice;
    @Column(name = "DISCOUNT_RATE")
    private double discountRate;

    @Column(name = "SELL_PRICE")
    private int sellPrice;

    protected Price() {}
    public Price(int regularPrice, double discountRate) {
        validateNegativePrice(regularPrice);
        validateNegativeDiscountRate(discountRate); // 검증하는 놈들.
        this.regularPrice = regularPrice;
        this.discountRate = discountRate;
        this.sellPrice = calcSellPrice(regularPrice, discountRate); // 검증후에 둘다 양수이면 sell Price를 계산해서 값을 넘겨줌
    }

    private void validateNegativePrice(int regularPrice) {
        if(regularPrice<0) {
            throw new IllegalArgumentException("가격은 음수일 수 없습니다.");
        }
    }

    private void validateNegativeDiscountRate(double discountRate) {
        if(discountRate<0) {
            throw new IllegalArgumentException("할인율은 음수일 수 없습니다.");
        }
    }

    private int calcSellPrice(int regularPrice, double discountRate) {
        return (int) (regularPrice - (regularPrice * discountRate));
    }

    public int getRegularPrice() {
        return regularPrice;
    }

    public double getDiscountRate() {
        return discountRate;
    }

    public int getSellPrice() {
        return sellPrice;
    }

    @Override
    public String toString() {
        return "Price{" +
                "regularPrice=" + regularPrice +
                ", discountRate=" + discountRate +
                ", sellPrice=" + sellPrice +
                '}';
    }
}
