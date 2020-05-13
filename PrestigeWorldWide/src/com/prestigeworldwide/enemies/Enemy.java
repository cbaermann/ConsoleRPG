package com.prestigeworldwide.enemies;

import com.prestigeworldwide.players.Player;

public class Enemy {
    private String name;
    private int health;
    private int strength;
    private int defence;

    //ATTACK THAT EFFECTS THE PLAYERS HEALTH
    public void enemyAttack(Player player) {
        if (player.getHealth() > 0) {
            System.out.println(getName() + " attacked for " + getStrength() + " damage");
            player.setHealth(player.getHealth() - this.getStrength());
        }
        if (player.getHealth() <= 0) {
            System.out.println("You were defeated!! Try again! ");
        }
    }
    //DEFENCE AGAINST A PLAYER ATTACK
    public void enemyDefend(Player player) {
        int result = player.getStrength() - this.getDefence();
        if (result <= 0) {
            System.out.println(player.getName() + " did no damage");
        } else {
            this.setHealth(this.health - result);
            System.out.println(player.getName() + " did " + result + " damage");
        }
    }
    //INCREASES ENEMY HEALTH
    public void enemyHeal() {
        setHealth(this.health + 10);
        System.out.println(this.getName() + " healed. Health is now: " + getHealth());
    }

    //GETTERS AND SETTERS
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

    //ENEMY STATS TO-STRING
    @Override
    public String toString() {
        return " health=" + getHealth() + "\n" +
                " strength=" + getStrength() + "\n" +
                " defence=" + getDefence() + "\n";
    }
}