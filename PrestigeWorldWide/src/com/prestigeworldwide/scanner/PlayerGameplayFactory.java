package com.prestigeworldwide.scanner;

import com.prestigeworldwide.players.Dwarf;
import com.prestigeworldwide.players.Elf;
import com.prestigeworldwide.players.Player;
import com.prestigeworldwide.players.Wizard;

public class PlayerGameplayFactory {

    private PlayerGameplayFactory(){

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
        //not working. If this calls choosePlayer again, it will not let you chose a new player.
//        else{
//            PlayerScanner ps = new PlayerScanner();
//            System.out.println("You must choose an option of 1, 2 or 3.");
//            ps.chosePlayer();
//        }

        return player;
    }
}
