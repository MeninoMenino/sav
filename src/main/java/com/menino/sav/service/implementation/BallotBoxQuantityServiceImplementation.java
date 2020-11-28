package com.menino.sav.service.implementation;

import com.menino.sav.model.BallotBoxQuantity;
import com.menino.sav.repository.BallotBoxQuantityRepository;
import com.menino.sav.service.BallotBoxQuantityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class BallotBoxQuantityServiceImplementation implements BallotBoxQuantityService {
    @Autowired
    BallotBoxQuantityRepository ballotBoxQuantityRepository;

    @Override
    public BallotBoxQuantity findById(Integer id) {
        Optional<BallotBoxQuantity> quantity = ballotBoxQuantityRepository.findById(id);

        if(quantity.isPresent()){
            return quantity.get();
        } else {
            throw new RuntimeException("BallotBoxQuantity not found");
        }
    }
}
