package com.prestigeworldwide.world;

import com.prestigeworldwide.enemies.Enemy;
import com.prestigeworldwide.players.Player;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class World {
//    String rooms[] = new String[] {"0","1", "2", "3", "4", "5", "6", "7", "8", "9"};
    public int currentRoom;

     public void startPoint(){
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
     public void roomOne(Player player, Enemy enemy){
         while(enemy.getHealth() > 0){
             
         }
     }
    public void roomTwo(){
        System.out.println("Room 2");
    }
    public void roomThree(){
        System.out.println("Room 3");
    }
    public void roomFour(){
        System.out.println("Room 4");
    }
    public void roomFive(){
        System.out.println("Room 5");
    }
    public void roomSix(){
        System.out.println("Room 6");
    }



}
/*
[0,0] [0,1] [0,2]
[1,0] [1.1] [1,2]
[2,0] [2,1] [2,2]

 */
