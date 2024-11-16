package com.Projeto.SpringBoot.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.Projeto.SpringBoot.dto.GameDto;
import com.Projeto.SpringBoot.dto.GameMinDto;
import com.Projeto.SpringBoot.entities.Game;
import com.Projeto.SpringBoot.repositories.GameRepository;
import jakarta.transaction.Transactional;

@Service
public class GameService {
    
    @Autowired
    private GameRepository gameRepository;

    @Transactional
    public GameDto findById(Long id){
        Game result = gameRepository.findById(id).get();
        return new GameDto(result);
    }

    @Transactional
    public List<GameMinDto> findAll(){
        List<Game> result = gameRepository.findAll();
        return result.stream().map(x -> new GameMinDto(x)).toList();  
    }
}