package com.ohgiraffers.mapping.section01.restaurant;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.stream.Stream;

@SpringBootTest
public class RestaurantTests {

    @Autowired
    private RestRegistService restRegistService;


    private static Stream<Arguments> createRest() {
        return Stream.of(
                Arguments.of(1,
                        "오니기리천국",
                        "일식",
                        "오니기리",
                        10,
                        "오사카 종로구",
                        "06-1111-1111",
                        "Y"
                ),
                Arguments.of(2,
                        "스시식당",
                        "일식",
                        "스시",
                        9,
                        "오사카 강서구",
                        "06-2222-2222",
                        "Y"
                )
        );
    }

    @DisplayName("JPA mapping annotation 실습!")
    @ParameterizedTest
    @MethodSource("createRest")
    void testCreateTable(int restNo, String restName, String foodType, String foodMain, int score,
                         String address, String phone, String status) {

        RestRegistDTO restInfo = new RestRegistDTO(
                restName,
                foodType,
                foodMain,
                score,
                address,
                phone,
                status
        );

        Assertions.assertDoesNotThrow(
                () -> restRegistService.registRest(restInfo)
        );
    }
}
