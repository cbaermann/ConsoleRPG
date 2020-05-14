package com.prestigeworldwide.gameplay;

import com.prestigeworldwide.enemies.Enemy;
import com.prestigeworldwide.players.Player;

import java.util.Random;
import java.util.Scanner;

public class GamePlay {

    public Player player;
    public Enemy enemy;
    Scanner scanner = new Scanner(System.in);
    private int currentRoom = 1;
    private String input;

    public void title() {
        titleDecorator();
        choosePlayer();
    }

    //CHOOSE YOUR CHARACTER TO PLAY WITH
    public void choosePlayer() {
        System.out.println("Who do you choose..." +
                "\n 1. Brennan \n 2. Nancy \n 3. Dale");
        input = scanner.nextLine();
        //Delegates to PlayerGamePlayFactory to instantiate a new player
        player = PlayerGameplayFactory.createPlayer(input);
        System.out.println("You chose " + player.getName() + ". " +
                "\n Base stats are as follows: \n" + player.toString());
        System.out.println("Are you sure you are ready for this?? (y/n)");
        input = scanner.nextLine();
        if (input.equalsIgnoreCase("y")) {
            beginning();
        }
        if (input.equalsIgnoreCase("n")) {
            System.out.println("Well you kind of have no choice \n \n");
            beginning();

        } else {
            System.out.println("Invalid input");
            choosePlayer();
        }
    }

    //PART ONE - DRUM ROOM BATTLE
    public void beginning() {
        System.out.println(" You awaken to the sound of someone playing drums," +
                            "\n but nobody plays your drums besides you!!" +
                            "\n \n Go investigate? (y/n) \n");
        input = scanner.nextLine();
        if (input.equalsIgnoreCase("y")) {
            enemy = EnemyGameplayFactory.createEnemy(currentRoom);
            System.out.println("You found " + enemy.getName() +
                    " playing with your drum set!" + "\n" + enemy.toString());
            if (enemy.getHealth() > 0 && player.getHealth() > 0) {
                battlePrompt();
            }
            if (enemy.getHealth() <= 0) {
                currentRoom++;
                partTwo();
            }
        }
        if (input.equalsIgnoreCase("n")) {
            choosePlayer();
        } else {
            System.out.println("Invalid input");
            beginning();
        }
    }

    //SECOND BATTLE - OFFICE BATTLE
    public void partTwo() {
        System.out.println("\n You just got a job at Derek's helicopter leasing company " +
                            "\n As you walk by an office, you repeatedly hear POW or PAW... " +
                            "\n you can't really tell exactly... \n \n" +
                            "\nInvestigate what the noise is? (y/n)");
        input = scanner.nextLine();
        if (input.equalsIgnoreCase("y")) {
            enemy = EnemyGameplayFactory.createEnemy(currentRoom);
            System.out.println("\n OH NO! It's Derek's coworker, the most annoying person ever, " +
                                enemy.getName() + "! " + "\n" + enemy.toString());
            if (enemy.getHealth() > 0) {
                battlePrompt();
            }
            if (enemy.getHealth() <= 0) {
                currentRoom++;
                partThree();
            }
        }
        if (input.equalsIgnoreCase("n")) {
            choosePlayer();
        }else{
            System.out.println("invalid input");
            partTwo();
        }
    }

    //PART THREE - TREE HOUSE BATTLE
    public void partThree() {
        System.out.println("\n You are in the back yard and you hear someone going " +
                "\n through your magazines while singing Sweet Child of Mine...\n \n" +
                "\nEnter the Tree House ready to attack like a spider monkey? (y/n)");
        input = scanner.nextLine();
        if (input.equalsIgnoreCase("y")) {
            enemy = EnemyGameplayFactory.createEnemy(currentRoom);
            System.out.println("\n DUN, DUN, DUN! It's Brennan's brother, " +
                    enemy.getName() + "! " + "\n" + enemy.toString());
            if (enemy.getHealth() > 0 && player.getHealth() > 0) {
                battlePrompt();
            }
            if (enemy.getHealth() <= 0) {
                congratsDecorator();
                System.out.println("\n You are the champion and can now sing " +
                        "\n Por Ti Volare at the Catalina Wine Mixer!");
                System.out.println("\nWould you like to play again? y/n");
                input = scanner.nextLine();
                if (input.equalsIgnoreCase("y")) {
                    currentRoom = 1;
                    choosePlayer();
                }
                if (input.equalsIgnoreCase("n")) {
                    System.out.println("Thank you for playing");
                    System.exit(0);
                }
                else {
                System.out.println("Invalid input");
                currentRoom = 1;
                choosePlayer();
                }
            }
        }
        if (input.equalsIgnoreCase("n")) {
            choosePlayer();
        }else{
            System.out.println("Invalid input");
            partThree();
        }
    }

    //OPTIONS DURING BATTLE
    public void battlePrompt() {
        while (enemy.getHealth() > 0 && player.getHealth() > 0) {
            System.out.println("Attack, Defend, Heal, or quit?  [a,d,h,q]");
            input = scanner.nextLine();
            if (input.equalsIgnoreCase("a")) {
                player.playerAttack(enemy);
                enemyAction();
            }
            if (input.equalsIgnoreCase("d")) {
                player.playerDefend(enemy);
            }
            if (input.equalsIgnoreCase("h")) {
                player.playerHeal();
                enemy.enemyAttack(player);
            }
            if (input.equalsIgnoreCase("q")) {
                choosePlayer();
            }
            healthStatus();
        }
        if (player.getHealth() <= 0) {
            choosePlayer();
        }
    }


    //Helper Methods

    //RANDOMIZED ENEMY RESPONSES DURING BATTLE
    public void enemyAction() {
        Random rand = new Random();
        int result = rand.nextInt(10 - 1) + 1;
        if (enemy.getHealth() > 0) {
            if (result > 0 && result <= 6) {
                enemy.enemyAttack(player);
            }
            if (result > 6 && result < 9) {
                enemy.enemyDefend(player);
            }
            if (result == 9) {
                enemy.enemyHeal();
            }
        }
    }

    //HELPER METHOD - PROVIDES HEALTH STATS OF BOTH OPPONENTS IN BETWEEN ACTIONS
    public void healthStatus() {
        System.out.println("\n" + "Your health= " + player.getHealth());
        System.out.println(enemy.getName() + "'s health= " + enemy.getHealth());
    }

    public void titleDecorator(){
        System.out.println("\n" +
                "╦ ╦┌─┐┬  ┌─┐┌─┐┌┬┐┌─┐  ┌┬┐┌─┐  ╔═╗┬─┐┌─┐┌─┐┌┬┐┬┌─┐┌─┐  ╦ ╦┌─┐┬─┐┬  ┌┬┐╦ ╦┬┌┬┐┌─┐\n" +
                "║║║├┤ │  │  │ ││││├┤    │ │ │  ╠═╝├┬┘├┤ └─┐ │ ││ ┬├┤   ║║║│ │├┬┘│   ││║║║│ ││├┤ \n" +
                "╚╩╝└─┘┴─┘└─┘└─┘┴ ┴└─┘   ┴ └─┘  ╩  ┴└─└─┘└─┘ ┴ ┴└─┘└─┘  ╚╩╝└─┘┴└─┴─┘─┴┘╚╩╝┴─┴┘└─┘\n");
    }

    public void congratsDecorator(){
        System.out.println("\n" +
                " ██████╗ ██████╗ ███╗   ██╗ ██████╗ ██████╗  █████╗ ████████╗██╗   ██╗██╗      █████╗ ████████╗██╗ ██████╗ ███╗   ██╗███████╗    \n" +
                "██╔════╝██╔═══██╗████╗  ██║██╔════╝ ██╔══██╗██╔══██╗╚══██╔══╝██║   ██║██║     ██╔══██╗╚══██╔══╝██║██╔═══██╗████╗  ██║██╔════╝    \n" +
                "██║     ██║   ██║██╔██╗ ██║██║  ███╗██████╔╝███████║   ██║   ██║   ██║██║     ███████║   ██║   ██║██║   ██║██╔██╗ ██║███████╗    \n" +
                "██║     ██║   ██║██║╚██╗██║██║   ██║██╔══██╗██╔══██║   ██║   ██║   ██║██║     ██╔══██║   ██║   ██║██║   ██║██║╚██╗██║╚════██║    \n" +
                "╚██████╗╚██████╔╝██║ ╚████║╚██████╔╝██║  ██║██║  ██║   ██║   ╚██████╔╝███████╗██║  ██║   ██║   ██║╚██████╔╝██║ ╚████║███████║    \n" +
                " ╚═════╝ ╚═════╝ ╚═╝  ╚═══╝ ╚═════╝ ╚═╝  ╚═╝╚═╝  ╚═╝   ╚═╝    ╚═════╝ ╚══════╝╚═╝  ╚═╝   ╚═╝   ╚═╝ ╚═════╝ ╚═╝  ╚═══╝╚══════╝    \n" +
                "                                                                                                                                 \n" +
                "                                                                                                                                 \n" +
                "                                                                                                                                 \n");
    }


}