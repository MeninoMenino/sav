package com.menino.sav.dto;

import com.menino.sav.model.Candidate;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class CandidateVotesTest {

    private static CandidateVotes candidateVotes;
    private static Candidate candidate;
    @BeforeAll
    static void setUp() {
        candidateVotes = new CandidateVotes();
        candidate = new Candidate();
    }

    @Test
    void getCandidate() {
        Candidate insert = candidate;
        candidateVotes.setCandidate(insert);
        Candidate valueReturned = candidateVotes.getCandidate();
        assertEquals(insert, valueReturned);
    }

    @Test
    void getPoints() {
        Integer insert = 1;
        candidateVotes.setPoints(insert);
        Integer valueReturned = candidateVotes.getPoints();
        assertEquals(insert, valueReturned);
    }
}