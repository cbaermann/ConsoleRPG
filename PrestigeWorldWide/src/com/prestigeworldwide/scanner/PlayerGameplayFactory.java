package com.prestigeworldwide.scanner;

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
        //not working. If this calls choosePlayer again, it will not let you chose a new player.
//        else{
//            PlayerScanner ps = new PlayerScanner();
//            System.out.println("You must choose an option of 1, 2 or 3.");
//            ps.chosePlayer();
//        }

        return player;
    }
}
