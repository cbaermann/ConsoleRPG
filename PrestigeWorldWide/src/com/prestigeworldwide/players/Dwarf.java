package com.prestigeworldwide.players;

import com.prestigeworldwide.enemies.Enemy;

public class Dwarf extends Player{
    public Dwarf(){
        setName("Dale");
        setDefence(10);
        setHealth(5);
        setStrength(10);
    }

    @Override
    public void attack(Enemy enemy) {
        System.out.println(getName() + " attacked for " + getStrength() + " damage");
        System.out.println(enemy.getHealth());
        enemy.setHealth(enemy.getHealth() - this.getStrength());
        System.out.println(enemy.getHealth());
    }

    @Override
    public void defend() {

    }
}
