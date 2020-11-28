package com.menino.sav.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Candidate {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idCandidate;
    private Integer idRole;
    private Integer idCounty;
    private String name;

    //Constructor
    public Candidate() {}

    //Getters and Setters

    public Integer getIdCandidate() {
        return idCandidate;
    }

    public void setIdCandidate(Integer idCandidate) {
        this.idCandidate = idCandidate;
    }

    public Integer getIdRole() {
        return idRole;
    }

    public void setIdRole(Integer idRole) {
        this.idRole = idRole;
    }

    public Integer getIdCounty() {
        return idCounty;
    }

    public void setIdCounty(Integer idCounty) {
        this.idCounty = idCounty;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
