package com.menino.sav.service.implementation;

import com.menino.sav.model.Candidate;
import com.menino.sav.repository.CandidateRepository;
import com.menino.sav.service.CandidateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CandidateServiceImplementation implements CandidateService {
    @Autowired
    CandidateRepository candidateRepository;

    @Override
    public List<Candidate> findByIdCountyAndIdRole(Integer idCounty, Integer idRole) {
        return candidateRepository.findByIdCountyAndIdRole(idCounty, idRole);
    }
}
