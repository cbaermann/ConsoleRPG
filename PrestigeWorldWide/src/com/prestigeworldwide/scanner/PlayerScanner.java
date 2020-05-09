package com.prestigeworldwide.scanner;


import com.prestigeworldwide.players.Elf;
import com.prestigeworldwide.players.Player;

import java.util.Scanner;

public class PlayerScanner extends Player {

    public Player player;
    public void title(){
        System.out.println("Welcome to Prestige World Wide");
    }

    public void chosePlayer(){
        Scanner scanner = new Scanner(System.in);
        String input;
            System.out.println("Who do you choose...");
            System.out.println("1. Elf");
            System.out.println("2. Wizard");
            System.out.println("3. Dwarf");

            input = scanner.nextLine();
            player = PlayerScannerFactory.createPlayer(input);
            System.out.println(player.toString());
    }

    @Override
    public void attack() {

    }

    @Override
    public void defend() {

    }
}
