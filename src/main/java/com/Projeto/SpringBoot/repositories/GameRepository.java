package com.Projeto.SpringBoot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Projeto.SpringBoot.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long>{

}