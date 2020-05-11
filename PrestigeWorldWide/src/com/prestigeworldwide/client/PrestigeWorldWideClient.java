package com.prestigeworldwide.client;

import com.prestigeworldwide.players.Elf;
import com.prestigeworldwide.players.Player;
import com.prestigeworldwide.scanner.PlayerScanner;
import com.prestigeworldwide.world.World;


public class PrestigeWorldWideClient {
    public static void main(String[] args) {
        PlayerScanner p = new PlayerScanner();
        p.title();
        p.chosePlayer();
//        p.begining();

//        Player e = new Elf();
//        System.out.println(e.toString());
//        e.setNumItems(1);
//        System.out.println(e.toString());
//        World w = new World();
//        System.out.println(w.worldMap[2][0]);
//        for(int[] world : w.worldMap){
//            for(int val : world){
//                System.out.println(val);
//            }
//        }

    }
}

