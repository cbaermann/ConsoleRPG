package com.prestigeworldwide.enemies;

import com.prestigeworldwide.players.Player;

public class RoomTwoEnemy extends Enemy{

    public RoomTwoEnemy() {
        setName("Randy (Derek's Coworker)");
        setDefence(6);
        setHealth(5);
        setStrength(4);
    }

    /*@Override
    public void attack(Player player) {

    }*/

    @Override
    public int defend(Player player) {
        return 0;
    }
}

