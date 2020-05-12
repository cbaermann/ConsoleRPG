package com.prestigeworldwide.world;
import com.prestigeworldwide.enemies.Enemy;
import com.prestigeworldwide.players.Player;

public class World {
    public int currentRoom;

    public void startPoint() {
        System.out.println(" You awaken to the sound of someone playing drums" +
                "\n but nobody plays your drums besides you" +
                "\n go investigate");
        System.out.println("Currently in Room: " + currentRoom + " moving ahead one room");
        currentRoom++;
        System.out.println("Currently in Room: " + currentRoom + " moving ahead one room");
        currentRoom++;
        System.out.println("Currently in Room: " + currentRoom + " moving ahead one room");
        currentRoom++;
        System.out.println("Currently in Room " + currentRoom);


    }

    public void roomOne(Player player, Enemy enemy) {
        while (enemy.getHealth() > 0) {

        }
        System.out.println("Oh no, " + enemy.getName() + " is playing your drumset");
        player.playerAttack(enemy);
    }

    public void roomTwo() {
        System.out.println("Room 2");
    }
}
