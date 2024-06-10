package com.example.billiards.repository;

import com.example.billiards.model.GameResult;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface GameResultRepository extends JpaRepository<GameResult, Long> {
    List<GameResult> findByGameId(Long gameId);
}
