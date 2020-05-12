package com.prestigeworldwide.players;

public class Dwarf extends Player{
    public Dwarf(){
        setName("Dale");
        setDefence(10);
        setHealth(5);
        setStrength(10);
    }

    @Override
    public int attack() {
        System.out.println(getName() + "attacked for " + getStrength() + "damage");
        return getStrength();
    }

    @Override
    public void defend() {

    }
}
