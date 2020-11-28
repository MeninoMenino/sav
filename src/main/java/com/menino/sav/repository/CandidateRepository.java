package com.menino.sav.repository;

import com.menino.sav.model.Candidate;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CandidateRepository extends JpaRepository<Candidate, Integer> {

    List<Candidate> findByIdCountyAndIdRole(Integer idCounty, Integer idRole);

}
