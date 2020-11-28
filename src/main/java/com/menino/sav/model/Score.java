package com.menino.sav.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;

@Entity
public class Score {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idScore;
    @NotNull
    private Integer idCandidate;
    @NotNull
    private Integer point;
    private LocalDateTime createdDate;

    //Constructor
    public Score(Integer idCandidate, Integer point, LocalDateTime createdDate){
        setIdCandidate(idCandidate);
        setPoint(point);
        setCreatedDate(createdDate);
    }

    //Getters and Setters

    public Integer getIdScore() {
        return idScore;
    }

    public void setIdScore(Integer idScore) {
        this.idScore = idScore;
    }

    public Integer getIdCandidate() {
        return idCandidate;
    }

    public void setIdCandidate(Integer idCandidate) {
        this.idCandidate = idCandidate;
    }

    public Integer getPoint() {
        return point;
    }

    public void setPoint(Integer point) {
        this.point = point;
    }

    public LocalDateTime getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(LocalDateTime createdDate) {
        this.createdDate = createdDate;
    }
}
