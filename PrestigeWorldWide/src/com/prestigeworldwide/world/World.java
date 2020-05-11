package com.prestigeworldwide.world;

import com.prestigeworldwide.players.Player;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class World {
     public void startPoint(){
         System.out.println(" You awaken to the sound of someone playing drums" +
                 "\n but nobody plays your drums besides you" +
                 "\n go investigate");
     }

     public void navigateThroughWorld(){
         System.out.println("Hi im navigating");
     }

     public void roomOne(Player player, Enemy enemy){
         System.out.println("Hey im in the drum room");
     }

    public void roomTwo(){
        System.out.println("Hi from room two");
    }
    public void roomThree(){
        System.out.println("Hi from room three");
    }
    public void roomFour(){
        System.out.println("Hi from room four");
    }
    public void roomFive(){
        System.out.println("Hi from room five");
    }
    public void roomSix(){
        System.out.println("Hi from room six");
    }
    public void roomSeven(){
        System.out.println("Hi from room seven");
    }
    public void roomEight(){
        System.out.println("Hi from room eight");
    }
    public void roomNine(){
        System.out.println("Hi from room nine");
    }


}
/*
[0,0] [0,1] [0,2]
[1,0] [1.1] [1,2]
[2,0] [2,1] [2,2]

 */
