package com.menino.sav.model;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


class CandidateTest {

    private static Candidate candidate;

    @BeforeAll
    static void setUp() {
        candidate = new Candidate();
    }

    @Test
    void getIdCandidate() {
        Integer insert = 1;
        candidate.setIdCandidate(insert);
        Integer valueReturned = candidate.getIdCandidate();
        assertEquals(insert, valueReturned);
    }

    @Test
    void getIdRole() {
        Integer insert = 1;
        candidate.setIdRole(insert);
        Integer valueReturned = candidate.getIdRole();
        assertEquals(insert, valueReturned);
    }

    @Test
    void getIdCounty() {
        Integer insert = 1;
        candidate.setIdCounty(insert);
        Integer valueReturned = candidate.getIdCounty();
        assertEquals(insert, valueReturned);
    }

    @Test
    void getName() {
        String insert = "Test";
        candidate.setName(insert);
        String valueReturned = candidate.getName();
        assertEquals(insert, valueReturned);
    }
}