package com.prestigeworldwide.players;

public class Wizard extends Player{
    public Wizard(){
        setName("Nancy");
        setDefence(5);
        setLuck(3);
        setStrength(7);
        setHealth(10);
    }

    @Override
    public void attack() {
        System.out.println("aarrggg");
    }

    @Override
    public void defend() {

    }
}
