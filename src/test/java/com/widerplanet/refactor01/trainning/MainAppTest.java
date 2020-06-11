package com.widerplanet.refactor01.trainning;

import static org.junit.jupiter.api.Assertions.*;

class MainAppTest {

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
    }

    @org.junit.jupiter.api.AfterEach
    void tearDown() {
    }

    @org.junit.jupiter.api.Test
    void main() {
        Customer customer = new Customer("와이더님");

        Movie movie1 = new Movie("킬링이브", Movie.NEW_RELEASE);
        Movie movie2 = new Movie("그녀", Movie.CHILDREN);

        Rental rental = new Rental(movie1, 3);
        Rental rental2 = new Rental(movie2, 4);

        customer.addRental(rental);
        customer.addRental(rental2);

        String resultStatements = customer.statement();

        String expectedStatements = "와이더님 고객님의 대여 기록 \n" +
                "\t킬링이브\t9.0\n" +
                "\t그녀\t3.0\n" +
                "누적 대여료 : 12.0\n" +
                "적립 포인트 : 3";

        assertEquals(expectedStatements,resultStatements );

    }
}