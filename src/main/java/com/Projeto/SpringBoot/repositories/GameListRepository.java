package com.Projeto.SpringBoot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Projeto.SpringBoot.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long>{

}