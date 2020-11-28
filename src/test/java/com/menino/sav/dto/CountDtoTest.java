package com.menino.sav.dto;

import com.menino.sav.model.BallotBoxQuantity;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class CountDtoTest {

    private static CountDto countDto;
    private static List<CandidateVotes> candidateVotes;

    @BeforeAll
    static void setUp() {
        countDto = new CountDto();
        candidateVotes = new ArrayList<>();
    }

    @Test
    void getCandidateVotes() {
        List<CandidateVotes> insert = candidateVotes;
        countDto.setCandidateVotes(insert);
        List<CandidateVotes> valueReturned = countDto.getCandidateVotes();
        assertEquals(insert, valueReturned);
    }

    @Test
    void getTotalVotes() {
        Integer insert = 1;
        countDto.setTotalVotes(insert);
        Integer valueReturned = countDto.getTotalVotes();
        assertEquals(insert, valueReturned);
    }

    @Test
    void getTotalBallotPercentage() {
        Double insert = 1D;
        countDto.setTotalBallotPercentage(insert);
        Double valueReturned = countDto.getTotalBallotPercentage();
        assertEquals(insert, valueReturned);
    }
}