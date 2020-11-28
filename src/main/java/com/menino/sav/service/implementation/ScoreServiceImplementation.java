package com.menino.sav.service.implementation;

import com.menino.sav.dto.InsertScoreDto;
import com.menino.sav.model.Score;
import com.menino.sav.repository.ScoreRepository;
import com.menino.sav.service.ScoreService;
import com.menino.sav.service.util.DtoToModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ScoreServiceImplementation implements ScoreService {

    @Autowired
    ScoreRepository scoreRepository;
    @Autowired
    DtoToModel dtoToModel;

    @Override
    public List<Score> listScores() {
        return scoreRepository.findAll();
    }

    @Override
    public List<Score> insertScores(List<InsertScoreDto> scoresDto) {
        List<Score> scores = dtoToModel.convertScore(scoresDto);
        return scoreRepository.saveAll(scores);
    }
}
