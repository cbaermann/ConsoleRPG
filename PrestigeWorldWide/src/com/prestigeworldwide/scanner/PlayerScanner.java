package com.prestigeworldwide.scanner;

import com.prestigeworldwide.players.Player;

import java.util.Scanner;

public class PlayerScanner{

    public Player player;
    public void title(){
        System.out.println("Welcome to Prestige World Wide");
    }

    public void chosePlayer(){
        Scanner scanner = new Scanner(System.in);
        String input;
            System.out.println("Who do you choose..." +
                    "\n 1. Elf \n 2. Wizard \n 3. Dwarf");
            input = scanner.nextLine();
            player = PlayerScannerFactory.createPlayer(input);
        System.out.println("You chose " + player.getName() + ". \n Base stats are as follows: " + player.toString());
    }

}
