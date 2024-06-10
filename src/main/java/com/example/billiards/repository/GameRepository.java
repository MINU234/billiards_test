package com.example.billiards.repository;

import com.example.billiards.model.Game;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface GameRepository extends JpaRepository<Game, Long> {
    List<Game> findByRoomId(Long roomId);
    List<Game> findByUserId(Long userId);
}
