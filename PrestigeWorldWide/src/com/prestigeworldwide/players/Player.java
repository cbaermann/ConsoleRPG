package com.prestigeworldwide.players;

import com.prestigeworldwide.enemies.Enemy;
import com.prestigeworldwide.items.Items;

import java.util.ArrayList;
import java.util.List;

public class Player {
    public static final int MAX_ATTRIBUTE_LEVEL = 100;
    private String name;
    private int health;
    private int strength;
    private int defence;
    public Player() {

    }

    public void playerAttack(Enemy enemy) {
        if (enemy.getHealth() > 0) {
            System.out.println(getName() + " attacked for " + getStrength() + " damage");
            enemy.setHealth(enemy.getHealth() - this.getStrength());
        }
        if (enemy.getHealth() <= 0) {
            System.out.println("You defeated " + enemy.getName());
        }

    }
    public void playerDefend(Enemy enemy){
        int result = enemy.getStrength() - this.getDefence();
        if(result <= 0){
            System.out.println(enemy.getName() + "did no damage");
        }
        else{
            this.setHealth(this.health - result);
            System.out.println(enemy.getName() + " did " + result + " damage");
        }
    }

    //Not actual implementation, checking to make sure heal method works
    public void heal() {
        setHealth(this.health + 10);
        System.out.println("Your health is now " + getHealth());
    }



    public int getHealth() {
        return health;
    }

    //create method to have if check for every attribute
    public void setHealth(int health) throws IllegalArgumentException {
        if (this.health <= MAX_ATTRIBUTE_LEVEL) {
            this.health = health;
        } else {
            throw new IllegalArgumentException("Can not exceed 100 for an attribute");
        }
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getDefence() {
        return defence;
    }

    public void setDefence(int defence) {
        this.defence = defence;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return " health=" + getHealth() + "\n" +
                " strength=" + getStrength() + "\n" +
                " defence=" + getDefence() + "\n";
    }
}