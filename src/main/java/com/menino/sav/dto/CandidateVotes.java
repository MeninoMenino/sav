package com.menino.sav.dto;

import com.menino.sav.model.Candidate;

public class CandidateVotes {
    private Candidate candidate;
    private Integer points;


    //Constructors
    public CandidateVotes(){}
    public CandidateVotes(Candidate candidate, Integer points){
        setCandidate(candidate);
        setPoints(points);
    }


    //Getters and Setters


    public Candidate getCandidate() {
        return candidate;
    }

    public void setCandidate(Candidate candidate) {
        this.candidate = candidate;
    }

    public Integer getPoints() {
        return points;
    }

    public void setPoints(Integer points) {
        this.points = points;
    }
}
