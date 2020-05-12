package com.prestigeworldwide.gameplay;

import com.prestigeworldwide.players.Dwarf;
import com.prestigeworldwide.players.Elf;
import com.prestigeworldwide.players.Player;
import com.prestigeworldwide.players.Wizard;

public class PlayerGameplayFactory {

    private PlayerGameplayFactory() {

    }

    public static Player createPlayer(String playerNum) {
        Player player = null;
        if (playerNum.equals("1")) {
            player = new Elf();
        }
        if (playerNum.equals("2")) {
            player = new Wizard();
        }
        if (playerNum.equals("3")) {
            player = new Dwarf();
        }
        else{
            GamePlay ps = new GamePlay();
            System.out.println("You must choose an option of 1, 2 or 3.");
            ps.choosePlayer();
        }

        return player;
    }
}
