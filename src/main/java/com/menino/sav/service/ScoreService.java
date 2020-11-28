package com.menino.sav.service;

import com.menino.sav.dto.InsertScoreDto;
import com.menino.sav.model.Score;

import java.util.List;

public interface ScoreService {

    List<Score> listScores();

    List<Score> insertScores(List<InsertScoreDto> scores);
}
