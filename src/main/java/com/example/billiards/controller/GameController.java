package com.example.billiards.controller;

import com.example.billiards.model.Game;
import com.example.billiards.model.GameResult;
import com.example.billiards.service.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/game")
public class GameController {

    @Autowired
    private GameService gameService;

    @PostMapping("/create")
    public Game createGame(@RequestBody Game game) {
        return gameService.createGame(game);
    }

    @GetMapping("/room/{roomId}")
    public List<Game> getGamesByRoomId(@PathVariable Long roomId) {
        return gameService.getGamesByRoomId(roomId);
    }

    @GetMapping("/{gameId}/results")
    public List<GameResult> getResultsByGameId(@PathVariable Long gameId) {
        return gameService.getResultsByGameId(gameId);
    }

    @PostMapping("/{gameId}/result")
    public void saveGameResult(@PathVariable Long gameId, @RequestBody GameResult gameResult) {
        gameService.saveGameResult(gameResult);
    }
}
