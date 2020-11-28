package com.menino.sav.model;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BallotBoxQuantityTest {

    private static BallotBoxQuantity ballotBoxQuantity;

    @BeforeAll
    static void setUp() {
        ballotBoxQuantity = new BallotBoxQuantity();
    }

    @Test
    void getIdBallotBoxQuantity() {
        Integer insert = 1;
        ballotBoxQuantity.setIdBallotBoxQuantity(insert);
        Integer valueReturned = ballotBoxQuantity.getIdBallotBoxQuantity();
        assertEquals(insert, valueReturned);
    }

    @Test
    void getValue() {
        Integer insert = 1;
        ballotBoxQuantity.setValue(insert);
        Integer valueReturned = ballotBoxQuantity.getValue();
        assertEquals(insert, valueReturned);
    }

    @Test
    void getIdCounty() {
        Integer insert = 1;
        ballotBoxQuantity.setIdCounty(insert);
        Integer valueReturned = ballotBoxQuantity.getIdCounty();
        assertEquals(insert, valueReturned);
    }
}