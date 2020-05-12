package com.prestigeworldwide.enemies;

import com.prestigeworldwide.players.Player;

public class RoomThreeEnemy extends Enemy{

    public RoomThreeEnemy() {
        setName("Brennan's brother Derek");
        setDefence(9);
        setHealth(9);
        setStrength(9);
    }

   /* @Override
    public void attack(Player player) {
    }*/

    @Override
    public int defend(Player player) {
        return 0;
    }
}