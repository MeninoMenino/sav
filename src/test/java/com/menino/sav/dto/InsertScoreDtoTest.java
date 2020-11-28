package com.menino.sav.dto;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

class InsertScoreDtoTest {

    private static InsertScoreDto insertScoreDto;

    @BeforeAll
    static void setUp() {
        insertScoreDto = new InsertScoreDto();
    }

    @Test
    void getIdCandidate() {
        Integer insert = 1;
        insertScoreDto.setIdCandidate(insert);
        Integer valueReturned = insertScoreDto.getIdCandidate();
        assertEquals(insert, valueReturned);
    }

    @Test
    void getPoint() {
        Integer insert = 1;
        insertScoreDto.setPoint(insert);
        Integer valueReturned = insertScoreDto.getPoint();
        assertEquals(insert, valueReturned);
    }
}