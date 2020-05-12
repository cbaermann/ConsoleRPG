package com.prestigeworldwide.players;

public class Elf extends Player{
    public Elf(){
        setName("Brennan");
        setDefence(3);
        setHealth(8);
        setStrength(8);
    }

    @Override
    public int attack() {
        return getStrength();
    }

    @Override
    public void defend() {

    }
}
