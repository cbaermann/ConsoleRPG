package com.prestigeworldwide.world;

import com.prestigeworldwide.enemies.Enemy;
import com.prestigeworldwide.players.Player;

public class World {
    public int currentRoom;


     public void startPoint() {
         System.out.println(" You awaken to the sound of someone playing drums," +
                 "\n but no one plays your drums besides you." +
                 "\n Go investigate!");
     }
    public void roomOne() {
    }

    public void roomTwo() {
        System.out.println("Room 2");
    }

    public void roomThree() {
        System.out.println("Room 3");
    }

    public void roomFour() {
        System.out.println("Room 4");
    }

    public void roomFive() {
        System.out.println("Room 5");
    }

    public void roomSix() {
        System.out.println("Room 6");

    }

    /*public void roomOne(Player player, Enemy enemy) {
        while (enemy.getHealth() > 0) {

        }
        System.out.println("Oh no, " + enemy.getName() + " is playing your drumset");
        player.playerAttack(enemy);
    }*/

}
