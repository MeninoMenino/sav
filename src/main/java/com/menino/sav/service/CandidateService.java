package com.menino.sav.service;

import com.menino.sav.model.Candidate;

import java.util.List;

public interface CandidateService{

    List<Candidate> findByIdCountyAndIdRole(Integer idCounty, Integer idRole);

}
