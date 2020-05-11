package com.prestigeworldwide.client;

import com.prestigeworldwide.enemies.Enemy;
import com.prestigeworldwide.enemies.RoomOneEnemy;
import com.prestigeworldwide.players.Dwarf;
import com.prestigeworldwide.players.Elf;
import com.prestigeworldwide.players.Player;
import com.prestigeworldwide.scanner.PlayerScanner;
import com.prestigeworldwide.world.World;


public class PrestigeWorldWideClient {
    public static void main(String[] args) {
//        PlayerScanner p = new PlayerScanner();
//        p.title();
//        p.chosePlayer();
        Player p = new Dwarf();
        Enemy e = new RoomOneEnemy();

        p.attack(e);



    }
}

