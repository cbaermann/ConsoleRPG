package com.prestigeworldwide.players;

import com.prestigeworldwide.enemies.Enemy;

public class Wizard extends Player{
    public Wizard(){
        setName("Nancy");
        setDefence(5);
        setStrength(7);
        setHealth(10);
    }

    @Override
    public void playerAttack(Enemy enemy) {
        System.out.println("aarrggg");

    }

    @Override
    public void defend() {

    }
}
