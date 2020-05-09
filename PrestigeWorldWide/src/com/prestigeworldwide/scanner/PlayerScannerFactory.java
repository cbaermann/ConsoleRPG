package com.prestigeworldwide.scanner;

import com.prestigeworldwide.players.Dwarf;
import com.prestigeworldwide.players.Elf;
import com.prestigeworldwide.players.Player;
import com.prestigeworldwide.players.Wizard;

public class PlayerScannerFactory {

    private PlayerScannerFactory(){

    }

    public static Player createPlayer(String playerNum){
        Player player = null;
        if(playerNum.equals("1")){
            player = new Elf();
        }
        if(playerNum.equals("2")){
            player = new Wizard();
        }
        if(playerNum.equals("3")){
            player = new Dwarf();
        }

        return player;
    }
}
