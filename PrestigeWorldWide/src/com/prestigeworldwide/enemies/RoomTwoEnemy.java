package com.prestigeworldwide.enemies;

public class RoomTwoEnemy extends Enemy{

    public RoomTwoEnemy() {
        setName("Randy");
        setDefence(6);
        setHealth(5);
        setStrength(4);
    }

    @Override
    public int attack() {
        return 0;
    }

    @Override
    public int defend() {
        return 0;
    }
}

