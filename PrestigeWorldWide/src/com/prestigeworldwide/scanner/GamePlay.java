package com.prestigeworldwide.scanner;

import com.prestigeworldwide.enemies.Enemy;
import com.prestigeworldwide.enemies.RoomOneEnemy;
import com.prestigeworldwide.players.Player;
import com.prestigeworldwide.world.World;

import java.util.Scanner;

public class GamePlay {

    public Player player;
    public Enemy enemy = new RoomOneEnemy();
    Scanner scanner = new Scanner(System.in);
    String input;

    public void title(){
        System.out.println("Welcome to Prestige World Wide");
    }

    public void chosePlayer(){
            System.out.println("Who do you choose..." +
                    "\n 1. Elf \n 2. Wizard \n 3. Dwarf");
            input = scanner.nextLine();
            player = PlayerGameplayFactory.createPlayer(input);
        System.out.println("You chose " + player.getName() + ". " +
                "\n Base stats are as follows: \n" + player.toString());
        System.out.println("Would you like to begin your journey? (y/n)");
        input = scanner.nextLine();
        if(input.equalsIgnoreCase("y")){
            begining();
        }
        else{
            System.out.println("Well you kind of have no choice");
            begining();
        }
    }

    public void begining(){
        World w = new World();
        w.startPoint();
        System.out.println("Would you like to continue forward? y/n");
        input = scanner.nextLine();
        if(input.equalsIgnoreCase("y")){
            System.out.println("you encountered " + enemy.getName() +
            "\n" + enemy.toString());
            if(enemy.getHealth() > 0 && player.getHealth() >0)   {
                battlePrompt();
            }
            if(enemy.getHealth() <= 0){
                partTwo();
            }
            if(player.getHealth() <=0){
                System.out.println("You have been defeated");
                chosePlayer();
            }
        }

    }

    public void partTwo(){
        System.out.println("\n \n \n \n");
        System.out.println("Hey part two");
    }







    public void battlePrompt(){
        while(enemy.getHealth() > 0 && player.getHealth() > 0) {
            System.out.println("Attack, Defend, Heal, or quit?  [a,d,h,q]");

            input = scanner.nextLine();
            if (input.equalsIgnoreCase("a")) {
                player.playerAttack(enemy);
                if(enemy.getHealth() > 0) {
                    enemy.enemyAttack(player);
                }
            }
            if(input.equalsIgnoreCase("d")){
                player.defend(enemy);
            }
            if (input.equalsIgnoreCase("h")) {
                player.heal();
            }
            if (input.equalsIgnoreCase("q")) {
                chosePlayer();
            }
        }
    }




}
