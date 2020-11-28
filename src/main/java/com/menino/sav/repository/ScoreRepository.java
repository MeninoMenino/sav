package com.menino.sav.repository;

import com.menino.sav.model.Score;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ScoreRepository extends JpaRepository<Score, Integer> {
}
