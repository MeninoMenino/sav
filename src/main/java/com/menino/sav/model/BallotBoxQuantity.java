package com.menino.sav.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class BallotBoxQuantity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idBallotBoxQuantity;
    private Integer value;
    private Integer idCounty;


    //Getters and Setters

    public Integer getIdBallotBoxQuantity() {
        return idBallotBoxQuantity;
    }

    public void setIdBallotBoxQuantity(Integer idBallotBoxQuantity) {
        this.idBallotBoxQuantity = idBallotBoxQuantity;
    }

    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }

    public Integer getIdCounty() {
        return idCounty;
    }

    public void setIdCounty(Integer idCounty) {
        this.idCounty = idCounty;
    }
}
