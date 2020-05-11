package com.prestigeworldwide.enemies;

public class RoomOneEnemy extends Enemy{

    public RoomOneEnemy() {
        setName("Robert");
        setDefence(4);
        setHealth(3);
        setStrength(3);
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
