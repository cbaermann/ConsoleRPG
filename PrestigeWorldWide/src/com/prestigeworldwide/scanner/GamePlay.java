package com.prestigeworldwide.scanner;

import com.prestigeworldwide.enemies.Enemy;
import com.prestigeworldwide.players.Player;
import com.prestigeworldwide.world.World;

import java.util.Random;
import java.util.Scanner;

public class GamePlay {

    public Player player;
    public Enemy enemy;
    Scanner scanner = new Scanner(System.in);
//    public Enemy enemy2 = new RoomTwoEnemy();
//    public Enemy enemy3 = new RoomThreeEnemy();
    String input;
    private int currentRoom = 1;

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
        World w = new World();
        System.out.println("\nEnter Room Three? y/n");
        input = scanner.nextLine();
        if (input.equalsIgnoreCase("y")) {
            enemy = EnemyGameplayFactory.createEnemy(currentRoom);
            System.out.println("\nDUN, DUN, DUN! The evil brother is here " +
                    enemy.getName() + "! " + "\n" + enemy.toString());
            if (enemy.getHealth() > 0 && player.getHealth() > 0) {
                battlePrompt();
            }
            if (enemy.getHealth() <= 0) {
                System.out.println("\nCongrats! You are the champion and can now sing " +
                        "\nPor Ti Volare at the Catalina Wine Mixer!");
            }
        }
        if (input.equalsIgnoreCase("n")) {
            w.startPoint();
        }
    }

    public void battlePrompt() {
        while (enemy.getHealth() > 0 && player.getHealth() > 0) {
            System.out.println("Attack, Defend, Heal, or quit?  [a,d,h,q]");
            input = scanner.nextLine();
            if (input.equalsIgnoreCase("a")) {
                player.playerAttack(enemy);
            }
            if (input.equalsIgnoreCase("d")) {
                player.playerDefend(enemy);
            }
            if (input.equalsIgnoreCase("h")) {
                player.heal();
            }
            if (input.equalsIgnoreCase("q")) {
                choosePlayer();
            }
            enemyAction();
            healthStatus();
        }
        if (player.getHealth() <= 0) {
            choosePlayer();
        }
    }

    public void enemyAction() {
        Random rand = new Random();
        int result = rand.nextInt(10 - 1) + 1;
        if (result > 0 && result <= 5) {
            enemy.enemyAttack(player);
            System.out.println(result);
        }
        if (result > 5 && result < 9) {
            enemy.enemyDefend(player);
            System.out.println(result);
        }
        if (result == 9) {
            enemy.enemyHeal();
        }
    }

    //Helper method
    public void healthStatus() {
        System.out.println("\n" + player.getName() + " health= " + player.getHealth());
        System.out.println(enemy.getName() + " health= " + enemy.getHealth());
    }
}