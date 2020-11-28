package com.menino.sav.repository;

import com.menino.sav.model.BallotBoxQuantity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface BallotBoxQuantityRepository extends JpaRepository<BallotBoxQuantity, Integer> {}
