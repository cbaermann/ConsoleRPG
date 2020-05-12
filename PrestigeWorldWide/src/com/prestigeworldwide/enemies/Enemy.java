package com.prestigeworldwide.enemies;

import java.sql.Date;

public abstract class Enemy {
    private String name;
    private int health;
    private int strength;
    private int defence;

    public Enemy (){
    }

    public Enemy(String name, int health, int strength, int defence) {
        this.name = name;
        this.health = health;
        this.strength = strength;
        this.defence = defence;
    }

    public abstract int attack();

    public abstract int defend();




    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
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
}
