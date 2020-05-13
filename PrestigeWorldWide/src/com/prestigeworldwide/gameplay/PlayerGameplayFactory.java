package com.prestigeworldwide.gameplay;

import com.prestigeworldwide.players.Brennan;
import com.prestigeworldwide.players.Dale;
import com.prestigeworldwide.players.Nancy;
import com.prestigeworldwide.players.Player;

public class PlayerGameplayFactory {

    private PlayerGameplayFactory() {

    }

    public static Player createPlayer(String playerNum){
        Player player = null;
        switch(playerNum){
            case "1":
                player = new Brennan();
                break;
            case "2":
                player = new Nancy();
                break;
            case "3":
                player = new Dale();
                break;
            default:
                System.out.println("Because you can not follow direction, we chose for you");
                player = new Dale();
        }
        return player;
    }
}