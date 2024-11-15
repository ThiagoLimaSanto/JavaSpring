package com.Projeto.SpringBoot.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Projeto.SpringBoot.dto.GameDto;
import com.Projeto.SpringBoot.services.GameService;


@RestController
@RequestMapping(value = "/games")
public class GameController {
    
    @Autowired
    private GameService gameService;

    @GetMapping   
    public List<GameDto> findAll(){
        List<GameDto> result = gameService.findAll(); 
        return result;
    }
}
