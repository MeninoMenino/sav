package com.menino.sav.dto;

import java.util.List;

public class CountDto {

    private List<CandidateVotes> candidateVotes;
    private Integer totalVotes;
    private Double totalBallotPercentage;

    public CountDto(){}

    public CountDto(List<CandidateVotes> candidateVotes, Integer totalVotes, Double totalBallotPercentage){
        setCandidateVotes(candidateVotes);
        setTotalVotes(totalVotes);
        setTotalBallotPercentage(totalBallotPercentage);
    }

    //Getters and Setters

    public List<CandidateVotes> getCandidateVotes() {
        return candidateVotes;
    }

    public void setCandidateVotes(List<CandidateVotes> candidateVotes) {
        this.candidateVotes = candidateVotes;
    }

    public Integer getTotalVotes() {
        return totalVotes;
    }

    public void setTotalVotes(Integer totalVotes) {
        this.totalVotes = totalVotes;
    }

    public Double getTotalBallotPercentage() {
        return totalBallotPercentage;
    }

    public void setTotalBallotPercentage(Double totalBallotPercentage) {
        this.totalBallotPercentage = totalBallotPercentage;
    }
}
