package com.menino.sav.service.util;

import com.menino.sav.dto.CandidateVotes;
import com.menino.sav.dto.CountDto;
import com.menino.sav.model.BallotBoxQuantity;
import com.menino.sav.model.Candidate;
import com.menino.sav.model.Score;
import com.menino.sav.service.implementation.BallotBoxQuantityServiceImplementation;
import com.menino.sav.service.implementation.CandidateServiceImplementation;
import com.menino.sav.service.implementation.ScoreServiceImplementation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CountingService {

    @Autowired
    CandidateServiceImplementation candidateServiceImplementation;
    @Autowired
    ScoreServiceImplementation scoreServiceImplementation;
    @Autowired
    BallotBoxQuantityServiceImplementation ballotBoxQuantityServiceImplementation;

    public CountDto count(Integer idCounty, Integer idRole){
        List<Candidate> candidates = candidateServiceImplementation.findByIdCountyAndIdRole(idCounty, idRole);
        List<Score> candidatesScores = new ArrayList<>();
        //Dto com candidato + votos
        List<CandidateVotes> candidateVotes = new ArrayList<>();
        boolean addNewCandidateVotes = true;
        //Total de votos
        Integer totalVotes = 0;

        //Recupera os votos dos candidatos
        for (Candidate candidate : candidates){
            candidatesScores.addAll(scoreServiceImplementation.findByIdCandidate(candidate.getIdCandidate()));
        }

        //Preenche a lista com CandidateVotes
        for(Score candidateScore : candidatesScores) {
            for(CandidateVotes candidateVote : candidateVotes){
                if(candidateScore.getIdCandidate().equals(candidateVote.getCandidate().getIdCandidate())){
                    candidateVote.setPoints(candidateVote.getPoints() + candidateScore.getPoint());
                    addNewCandidateVotes = false;
                }
            }
            if(addNewCandidateVotes){
                Candidate candidateAdd = new Candidate();
                for(Candidate candidate : candidates){
                    if(candidate.getIdCandidate().equals(candidateScore.getIdCandidate())){
                        candidateAdd = candidate;
                    }
                }
                candidateVotes.add(new CandidateVotes(candidateAdd, candidateScore.getPoint()));
            }

            //Soma todos os votos
            totalVotes += candidateScore.getPoint();
            addNewCandidateVotes = true;
        }

        BallotBoxQuantity quantity = ballotBoxQuantityServiceImplementation.findById(idCounty);
        double percentage;
        if(candidateVotes.size() == 0 || quantity.getValue() == 0){
            percentage = 0;
        } else {
            percentage = (100 * (candidatesScores.size())/candidateVotes.size())/quantity.getValue();
        }

        CountDto countDto = new CountDto(candidateVotes, totalVotes, percentage);

        return countDto;
    }
}
