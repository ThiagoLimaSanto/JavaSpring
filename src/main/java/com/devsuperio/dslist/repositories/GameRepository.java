package com.devsuperio.dslist.repositories;


import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperio.dslist.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long>{
    
}