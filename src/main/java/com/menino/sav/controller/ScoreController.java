package com.menino.sav.controller;

import com.menino.sav.dto.CountDto;
import com.menino.sav.dto.InsertScoreDto;
import com.menino.sav.model.Score;
import com.menino.sav.service.implementation.CandidateServiceImplementation;
import com.menino.sav.service.implementation.ScoreServiceImplementation;
import com.menino.sav.service.util.CountingService;
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
    @Autowired
    CountingService countingService;

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
    @GetMapping("/prefeito")
    public CountDto countVotesPrefeito(@RequestParam("idCounty") Integer idCounty){
        return countingService.count(idCounty, 1);
    }

    @GetMapping("/vereador")
    public CountDto countVotesVereador(@RequestParam("idCounty") Integer idCounty){
        return countingService.count(idCounty, 2);
    }
}