package com.prestigeworldwide.players;

import com.prestigeworldwide.enemies.Enemy;

public class Dwarf extends Player{
    public Dwarf(){
        setName("Dale");
        setDefence(10);
        setHealth(5);
        setStrength(3);
    }

    @Override
    public void playerAttack(Enemy enemy) {
        if(enemy.getHealth() > 0) {
            System.out.println(getName() + " attacked for " + getStrength() + " damage");
            enemy.setHealth(enemy.getHealth() - this.getStrength());
        }
        if(enemy.getHealth()<= 0){
            System.out.println("You defeated " + enemy.getName());
        }

    }

    @Override
    public void defend() {

    }
}
