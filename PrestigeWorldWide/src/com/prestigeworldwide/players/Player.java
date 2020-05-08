package com.prestigeworldwide.players;

public abstract class Player {
    public static final int MAX_ATTRIBUTE_LEVEL = 100;

    private int health;
    private int strength;
    private int defence;
    private int luck;
    private int numItems;


    public Player(){

    }

    public abstract void attack();
    public abstract void defend();

    //Not actual implementation, checking to make sure heal method works
    public void heal(){
        if(numItems > 0){
            setHealth(this.health +10);
        }
    }


    public int getHealth() {
        return health;
    }

        //create method to have if check for every attribute
    public void setHealth(int health) throws IllegalArgumentException{
        if(this.health <= MAX_ATTRIBUTE_LEVEL) {
            this.health = health;
        }
        else {
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

    public int getLuck() {
        return luck;
    }

    public void setLuck(int luck) {
        this.luck = luck;
    }

    public int getNumItems() {
        return numItems;
    }

    public void setNumItems(int numItems) {
        this.numItems = numItems;
    }

    @Override
    public String toString() {
        return "Player{" +
                "health=" + health +
                ", strength=" + strength +
                ", defence=" + defence +
                ", luck=" + luck +
                '}';
    }
}
