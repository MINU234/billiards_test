package com.example.billiards.service;

import com.example.billiards.model.Game;
import com.example.billiards.model.GameResult;
import com.example.billiards.repository.GameRepository;
import com.example.billiards.repository.GameResultRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GameService {

    @Autowired
    private GameRepository gameRepository;

    @Autowired
    private GameResultRepository gameResultRepository;

    public Game createGame(Game game) {
        return gameRepository.save(game);
    }

    public List<Game> getGamesByRoomId(Long roomId) {
        return gameRepository.findByRoomId(roomId);
    }

    public List<GameResult> getResultsByGameId(Long gameId) {
        return gameResultRepository.findByGameId(gameId);
    }

    public void saveGameResult(GameResult gameResult) {
        gameResultRepository.save(gameResult);
    }
}
