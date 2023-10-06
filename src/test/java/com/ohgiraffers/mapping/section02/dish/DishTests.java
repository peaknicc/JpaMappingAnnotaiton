package com.ohgiraffers.mapping.section02.dish;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDate;
import java.util.stream.Stream;

@SpringBootTest
public class DishTests {

    @Autowired
    private DishRegistService dishRegistService;

    private static Stream<Arguments> createDish() {
        return Stream.of(
                Arguments.of(
                        "황금라면",
                        "한식",
                        "맛좋은라면",
                        "서울시 종로구",
                        LocalDate.now(),
                        20000,
                        0.1
                ),
                Arguments.of(
                        "유부초밥",
                        "일식",
                        "슥삭스시",
                        "부산시 동구",
                        LocalDate.now(),
                        21000,
                        0.2
                )
        );
    }

    @DisplayName("JPA mapping annotation 실습! 두번째!!")
    @ParameterizedTest
    @MethodSource("createDish")
    void testCreateTable(String restName, String dishType, String dishName, String address,
                         LocalDate releaseDate, int regularPrice, double discountRate) {

        DishRegistDTO dishInfo = new DishRegistDTO(
                restName,
                dishType,
                dishName,
                address,
                releaseDate,
                regularPrice,
                discountRate
        );

        Assertions.assertDoesNotThrow(
                () -> dishRegistService.registDish(dishInfo)
        );
    }
}
