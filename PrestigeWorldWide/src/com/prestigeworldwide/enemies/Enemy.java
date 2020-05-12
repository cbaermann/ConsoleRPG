package com.prestigeworldwide.enemies;

import com.prestigeworldwide.players.Player;

import java.util.Random;

public class Enemy {
    private String name;
    private int health;
    private int strength;
    private int defence;


    public void enemyAttack(Player player) {
        if (player.getHealth() > 0) {
            System.out.println(getName() + " attacked for " + getStrength() + " damage");
            player.setHealth(player.getHealth() - this.getStrength());
        }
        if (player.getHealth() <= 0) {
            System.out.println("You were defeated!! Try again! ");
        }
    }

    public void enemyDefend(Player player){
        int result = player.getStrength() - this.getDefence();
        if(result <= 0){
            System.out.println(player.getName() + " did no damage");
        }
        else{
            this.setHealth(this.health - result);
            System.out.println(player.getName() + " did " + result + " damage");
        }
    }

    public void enemyHeal(){
        setHealth(this.health + 10);
        System.out.println("Your health is now " + getHealth());
    }


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

    @Override
    public String toString() {
        return " health=" + getHealth() + "\n" +
                " strength=" + getStrength() + "\n" +
                " defence=" + getDefence() + "\n";
    }
}