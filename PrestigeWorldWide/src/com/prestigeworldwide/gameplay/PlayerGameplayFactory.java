package com.prestigeworldwide.gameplay;

import com.prestigeworldwide.players.Brennan;
import com.prestigeworldwide.players.Dale;
import com.prestigeworldwide.players.Nancy;
import com.prestigeworldwide.players.Player;

public class PlayerGameplayFactory {

    private PlayerGameplayFactory() {

    }

    public static Player createPlayer(String playerNum) {
        Player player = null;
        if (playerNum.equals("1")) {
            player = new Brennan();
        }
        if (playerNum.equals("2")) {
            player = new Nancy();
        }
        if (playerNum.equals("3")) {
            player = new Dale();
        }
//        else{
//            System.out.println("You cannot follow directions, so  we chose for you!");
//
//        }

        return player;
    }
}
