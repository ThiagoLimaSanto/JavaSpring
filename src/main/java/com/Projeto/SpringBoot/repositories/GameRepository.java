package com.Projeto.SpringBoot.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.Projeto.SpringBoot.Projections.GameMinProjection;
import com.Projeto.SpringBoot.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long> {

    @Query(nativeQuery = true, value = """
            SELECT TB_GAME.ID, TB_GAME.TITLE, TB_GAME.GAME_YEAR, TB_GAME.IMG_URL, TB_GAME.SHORT_DESCRIPTION, TB_BELONGING.POSITION
            FROM TB_GAME 
            INNER JOIN TB_BELONGING   ON  TB_GAME.ID = TB_BELONGING.GAME_ID 
            WHERE TB_BELONGING.LIST_ID = :listId
            ORDER BY TB_BELONGING.POSITION 
            	""")
    List<GameMinProjection> searchByList(Long listId);
}