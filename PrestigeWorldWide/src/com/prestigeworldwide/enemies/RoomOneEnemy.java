package com.prestigeworldwide.enemies;

public class RoomOneEnemy extends Enemy{

    public RoomOneEnemy(String a, int b, int c, int d) {
    }

    public RoomOneEnemy() {
        setName("Robert");
        setDefence(4);
        setHealth(3);
        setStrength(3);
    }


    @Override
    public int attack() {
        for (int i = 0; getHealth() > 0; attack()){
        }
        return 0;
    }

    @Override
    public int defend() {
        return 0;
    }
}
