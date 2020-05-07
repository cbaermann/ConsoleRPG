package com.prestigeworldwide.players;

public abstract class Player {
    private int health;
    private int strength;
    private int defence;
    private int luck;

    public Player(){

    }

    public abstract void attack();
    public abstract void defend();


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

    public int getLuck() {
        return luck;
    }

    public void setLuck(int luck) {
        this.luck = luck;
    }
}
