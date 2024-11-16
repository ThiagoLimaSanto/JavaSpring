package com.Projeto.SpringBoot.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.Projeto.SpringBoot.dto.GameListDto;
import com.Projeto.SpringBoot.entities.GameList;
import com.Projeto.SpringBoot.repositories.GameListRepository;
import jakarta.transaction.Transactional;

@Service
public class GameListService {
    
    @Autowired
    private GameListRepository gameListRepository;

    @Transactional
    public List<GameListDto> findAll(){
        List<GameList> result = gameListRepository.findAll();
        return result.stream().map(x -> new GameListDto(x)).toList();  
    }
}