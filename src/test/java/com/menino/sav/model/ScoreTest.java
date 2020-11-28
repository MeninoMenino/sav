package com.menino.sav.model;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ScoreTest {

    private static Score score;

    @BeforeAll
    static void setUp() {
        score = new Score();
    }

    @Test
    void setIdScore() {
        Integer insert = 1;
        score.setIdScore(insert);
        Integer valueReturned = score.getIdScore();
        assertEquals(insert, valueReturned);
    }

    @Test
    void setIdCandidate() {
        Integer insert = 1;
        score.setIdCandidate(insert);
        Integer valueReturned = score.getIdCandidate();
        assertEquals(insert, valueReturned);
    }

    @Test
    void setPoint() {
        Integer insert = 1;
        score.setPoint(insert);
        Integer valueReturned = score.getPoint();
        assertEquals(insert, valueReturned);
    }

    @Test
    void setCreatedDate() {
        LocalDateTime insert = LocalDateTime.now();
        score.setCreatedDate(insert);
        LocalDateTime valueReturned = score.getCreatedDate();
        assertEquals(insert, valueReturned);
    }
}