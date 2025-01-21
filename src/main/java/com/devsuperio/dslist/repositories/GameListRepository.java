package com.devsuperio.dslist.repositories;


import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperio.dslist.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long>{
    
}