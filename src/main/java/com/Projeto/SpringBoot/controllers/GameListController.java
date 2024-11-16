package com.Projeto.SpringBoot.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Projeto.SpringBoot.dto.GameListDto;
import com.Projeto.SpringBoot.services.GameListService;


@RestController
@RequestMapping(value = "/lists")
public class GameListController {
    
    @Autowired
    private GameListService gameListService;

    @GetMapping   
    public List<GameListDto> findAll(){
        List<GameListDto> result = gameListService.findAll(); 
        return result;
    }
}
