package com.prestigeworldwide.scanner;

import com.prestigeworldwide.players.Player;
import com.prestigeworldwide.world.World;

import java.util.Scanner;

public class PlayerScanner{

    public Player player;
    Scanner scanner = new Scanner(System.in);
    String input;

    public void title(){
        System.out.println("Welcome to Prestige World Wide");
    }

    public void chosePlayer(){
//        Scanner scanner = new Scanner(System.in);
//        String input;
            System.out.println("Who do you choose..." +
                    "\n 1. Elf \n 2. Wizard \n 3. Dwarf");
            input = scanner.nextLine();
            player = PlayerScannerFactory.createPlayer(input);
        System.out.println("You chose " + player.getName() + ". \n Base stats are as follows: \n" + player.toString());
        player.showPlayerItems();
        System.out.println("Would you like to begin your journey? (y/n)");
        input = scanner.nextLine();
        if(input.equals("y")){
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
        System.out.println("Where would you like to go?. U");
        input = scanner.nextLine();
        if(input.equals("u")){
            w.roomOne();
        }

    }




}
