package com.menino.sav.controller;

import com.menino.sav.dto.InsertScoreDto;
import com.menino.sav.model.Candidate;
import com.menino.sav.model.Score;
import com.menino.sav.service.implementation.CandidateServiceImplementation;
import com.menino.sav.service.implementation.ScoreServiceImplementation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/score")
public class ScoreController {

    @Autowired
    ScoreServiceImplementation scoreServiceImplementation;
    @Autowired
    CandidateServiceImplementation candidateServiceImplementation;

    //Lista todas as pontuações de votos
    @GetMapping
    public List<Score> listScores() {
        return scoreServiceImplementation.listScores();
    }

    //Insere uma nova lista de pontuações
    @PostMapping
    public List<Score> insertScores(@RequestBody List<InsertScoreDto> scores) {
        return scoreServiceImplementation.insertScores(scores);
    }


    //Apurações

    @GetMapping("/mayor")
    public List<Candidate> apurateMayorVotes(@RequestParam("idCounty") Integer idCounty, @RequestParam("idRole") Integer idRole){
        return candidateServiceImplementation.findByIdCountyAndIdRole(idCounty, idRole);
    }
}