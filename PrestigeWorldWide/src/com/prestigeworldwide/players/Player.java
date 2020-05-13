package com.prestigeworldwide.players;

import com.prestigeworldwide.enemies.Enemy;

public class Player {
    public static final int MAX_ATTRIBUTE_LEVEL = 100;
    private String name;
    private int health;
    private int strength;
    private int defence;

    public Player() {

    }
    //ATTACK THAT EFFECTS ENEMY HEALTH
    public void playerAttack(Enemy enemy) {
        if (enemy.getHealth() > 0) {
            System.out.println(getName() + " attacked for " + getStrength() + " damage");
            enemy.setHealth(enemy.getHealth() - this.getStrength());
        }
        if (enemy.getHealth() <= 0) {
            System.out.println("You defeated " + enemy.getName());
            this.setHealth(this.getHealth() + 10);
            System.out.println("\n \nYour health has been boosted to " + this.getHealth());
        }

    }
    //DEFENDS AGAINST ENEMY ATTACK
    public void playerDefend(Enemy enemy) {
        int result = enemy.getStrength() - this.getDefence();
        if (result <= 0) {
            System.out.println(enemy.getName() + " did no damage");
        } else {
            this.setHealth(this.health - result);
            System.out.println(enemy.getName() + " did " + result + " damage");
        }
    }

    //INCREASES PLAYER HEALTH
    public void playerHeal() {
        setHealth(this.health + 10);
        System.out.println("Your health is now " + getHealth());
    }

    //GETTERS AND SETTERS
    public int getHealth() {
        return health;
    }

    public void setHealth(int health) throws IllegalArgumentException {
        if (this.health <= MAX_ATTRIBUTE_LEVEL) {
            this.health = health;
        } else {
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    //PLAYER STATS TO-STRING
    @Override
    public String toString() {
        return " health=" + getHealth() + "\n" +
                " strength=" + getStrength() + "\n" +
                " defence=" + getDefence() + "\n";
    }
}