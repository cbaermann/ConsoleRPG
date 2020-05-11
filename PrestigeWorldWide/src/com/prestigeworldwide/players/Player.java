package com.prestigeworldwide.players;

import com.prestigeworldwide.items.ItemCatalog;
import com.prestigeworldwide.items.Items;

import java.util.ArrayList;
import java.util.List;

public abstract class Player {
    public static final int MAX_ATTRIBUTE_LEVEL = 100;
    private String name;
    private int health;
    private int strength;
    private int defence;
    private int numItems;
    public List<Items> playerItems = new ArrayList<>();

    public Player(){

    }

    public abstract int attack();
    public abstract void defend();

    //Not actual implementation, checking to make sure heal method works
    public void heal(){
        if(numItems > 0){
            setHealth(this.health +10);
        }
    }

    public void showPlayerItems(){
        if(!playerItems.isEmpty()) {
            for (Items item : playerItems) {
                System.out.println(item);
//                System.out.println("No items currently in your inventory");
            }
        }
        else {
            System.out.println("No items currently in your inventory \n");
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

    public int getNumItems() {
        return numItems;
    }

    public void setNumItems(int numItems) {
        this.numItems = numItems;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return  " health=" + getHealth() + "\n" +
                " strength=" + getStrength() + "\n" +
                " defence=" + getDefence() + "\n";
    }
}
