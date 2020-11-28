package com.menino.sav.service.util;

import com.menino.sav.dto.InsertScoreDto;
import com.menino.sav.model.Score;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class DtoToModel {

    public List<Score> convertScore(List<InsertScoreDto> scoresDto){
        List<Score> scores = new ArrayList<>();
        for(InsertScoreDto scoreDto : scoresDto){
            Score score = new Score(scoreDto.getIdCandidate(), scoreDto.getPoint(), LocalDateTime.now());
            scores.add(score);
        }
        return scores;
    }
}
