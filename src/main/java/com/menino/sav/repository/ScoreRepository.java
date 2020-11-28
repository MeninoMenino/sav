package com.menino.sav.repository;

import com.menino.sav.model.Score;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface ScoreRepository extends JpaRepository<Score, Integer> {

    List<Score> findByIdCandidate(Integer idCandidate);

}
