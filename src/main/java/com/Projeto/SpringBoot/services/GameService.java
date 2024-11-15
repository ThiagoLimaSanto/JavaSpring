package com.Projeto.SpringBoot.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Projeto.SpringBoot.dto.GameDto;
import com.Projeto.SpringBoot.entities.Game;
import com.Projeto.SpringBoot.repositories.GameRepository;

@Service
public class GameService {
    
    @Autowired
    private GameRepository gameRepository;

    public List<GameDto> findAll(){
        List<Game> result = gameRepository.findAll();
        return result.stream().map(x -> new GameDto(x)).toList();  
    }
}