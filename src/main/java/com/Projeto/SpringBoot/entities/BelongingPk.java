package com.Projeto.SpringBoot.entities;

import java.util.Objects;

import jakarta.persistence.Embeddable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Embeddable
public class BelongingPk {
    
    @ManyToOne
    @JoinColumn(name = "Game_id")
    private Game game;

    @ManyToOne
    @JoinColumn(name = "GameList_id")
    private GameList gameList;

    public BelongingPk(){}

    public BelongingPk(Game game, GameList gameList) {
        this.game = game;
        this.gameList = gameList;
    }

    public Game getGame() {
        return game;
    }

    public void setGame(Game game) {
        this.game = game;
    }

    public GameList getGameList() {
        return gameList;
    }

    public void setGameList(GameList gameList) {
        this.gameList = gameList;
    }

    @Override
    public int hashCode() {
        return Objects.hash(game, gameList);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final BelongingPk other = (BelongingPk) obj;
        if (!Objects.equals(this.game, other.game)) {
            return false;
        }
        return Objects.equals(this.gameList, other.gameList);
    }  
}