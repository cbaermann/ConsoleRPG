package com.prestigeworldwide.enemies;

public class RoomThreeEnemy extends Enemy{

    public RoomThreeEnemy() {
        setName("Derek");
        setDefence(9);
        setHealth(9);
        setStrength(9);
    }

    @Override
    public int attack() {
        for (int i = 0; getHealth() > 0; attack()){
        }
        return getHealth();
    }

    @Override
    public int defend() {
        return 0;
    }
}