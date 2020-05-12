package com.prestigeworldwide.scanner;

import com.prestigeworldwide.enemies.Enemy;
import com.prestigeworldwide.players.Player;
import com.prestigeworldwide.world.World;

import java.util.Scanner;

public class GamePlay {

    public Player player;
    public Enemy enemy;
    private int currentRoom = 1;
//    public Enemy enemy2 = new RoomTwoEnemy();
//    public Enemy enemy3 = new RoomThreeEnemy();

    Scanner scanner = new Scanner(System.in);
    String input;

    public void title() {
        System.out.println("Welcome to Prestige World Wide");
        choosePlayer();
    }

    public void choosePlayer() {
        System.out.println("Who do you choose..." +
                "\n 1. Elf \n 2. Wizard \n 3. Dwarf");
        input = scanner.nextLine();
        player = PlayerGameplayFactory.createPlayer(input);
        System.out.println("You chose " + player.getName() + ". " +
                "\n Base stats are as follows: \n" + player.toString());
        System.out.println("Would you like to begin your journey? (y/n)");
        input = scanner.nextLine();
        if (input.equalsIgnoreCase("y")) {
            beginning();
        } else {
            if (input.equalsIgnoreCase("y")) {
                beginning();
            } else {
                System.out.println("Well you kind of have no choice");
                beginning();
            }
        }
    }


    public void beginning() {
        World w = new World();
        w.startPoint();
        System.out.println("Would you like to continue forward? y/n");
        input = scanner.nextLine();
        if (input.equalsIgnoreCase("y")) {
            enemy = EnemyGameplayFactory.createEnemy(currentRoom);
            System.out.println("you encountered " + enemy.getName() +
                    "\n" + enemy.toString());
            if (enemy.getHealth() > 0 && player.getHealth() > 0) {
                battlePrompt();
            }
            if (enemy.getHealth() <= 0) {
                currentRoom++;
                partTwo();
            }
        }
    }


    public void partTwo() {
        World w = new World();
//        w.startPoint();
        System.out.println("\nEnter Room Two? y/n");
        input = scanner.nextLine();
        if (input.equalsIgnoreCase("y")) {
            enemy = EnemyGameplayFactory.createEnemy(currentRoom);
            System.out.println("\nOh no! You encountered the most annoying person ever, " +
                    enemy.getName() + "! " + "\n" + enemy.toString());
            if (enemy.getHealth() > 0) {
                battlePrompt();
            }
            if (enemy.getHealth() <= 0) {
                currentRoom++;
                partThree();
            }
            if (input.equalsIgnoreCase("n")) {
                w.startPoint();
            }
        }
    }

    public void partThree() {
        System.out.println("\n\n\n Part Three under construction");
    }

    public void battlePrompt() {
        while (enemy.getHealth() > 0 && player.getHealth() > 0) {
            System.out.println("Attack , Heal, or quit?  [a,h,q]");
            input = scanner.nextLine();
            if (input.equalsIgnoreCase("a")) {
                player.playerAttack(enemy);
                if (enemy.getHealth() > 0) {
                    enemy.enemyAttack(player);
                }
                healthStatus();
            }
            if (input.equalsIgnoreCase("h")) {
                player.heal();
            }
            if (input.equalsIgnoreCase("q")) {
                choosePlayer();
            }
        }
    }

    //Helper method
    public void healthStatus() {
        System.out.println("\n" + player.getName() + " health= " + player.getHealth());
        System.out.println(enemy.getName() + " health= " + enemy.getHealth());
    }
}