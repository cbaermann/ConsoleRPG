package com.prestigeworldwide.players;

public class Wizard extends Player{
    public Wizard(){
        setName("Nancy");
        setDefence(5);
        setStrength(7);
        setHealth(10);
    }

    @Override
    public int attack() {
        System.out.println("aarrggg");
        return getStrength();
    }

    @Override
    public void defend() {

    }
}
