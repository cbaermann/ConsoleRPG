package com.prestigeworldwide.enemies;

import com.prestigeworldwide.players.Player;

public class RoomOneEnemy extends Enemy{

    public RoomOneEnemy(String a, int b, int c, int d) {
    }

    public RoomOneEnemy() {
        setName("Robert");
        setDefence(4);
        setHealth(3);
        setStrength(1);
    }

    /*@Override
    public void attack(Player player) {
        if(player.getHealth() > 0) {
            System.out.println(getName() + " attacked for " + getStrength() + " damage");
            player.setHealth(player.getHealth() - this.getStrength());
        }
        if(player.getHealth()< 0){
            System.out.println("You were defeated!! Try again! " );
        }
    }*/


    //work in progress
    public int defend(Player player) {
//        if (player.getHealth() > 0) {
//            player.setHealth(player.getHealth() - this.getStrength()); //needs to change
//
//        }
        return 0;
    }
}
