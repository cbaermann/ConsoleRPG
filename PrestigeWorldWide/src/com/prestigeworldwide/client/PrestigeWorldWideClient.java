package com.prestigeworldwide.client;

import com.prestigeworldwide.items.ItemCatalog;
import com.prestigeworldwide.items.Items;
import com.prestigeworldwide.players.Elf;
import com.prestigeworldwide.players.Player;
import com.prestigeworldwide.scanner.PlayerScanner;


public class PrestigeWorldWideClient {
    public static void main(String[] args) {
//        PlayerScanner p = new PlayerScanner();
//        p.title();
//        p.chosePlayer();

        Player e = new Elf();
        System.out.println(e.toString());
        e.setNumItems(1);
        System.out.println(e.toString());

    }
}

