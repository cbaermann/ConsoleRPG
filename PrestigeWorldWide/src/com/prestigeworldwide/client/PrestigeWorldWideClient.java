package com.prestigeworldwide.client;

import com.prestigeworldwide.players.Elf;
import com.prestigeworldwide.players.Player;

public class PrestigeWorldWideClient {
    public static void main(String[] args) {
        Player d = new Elf();
        System.out.println(d.toString());
        d.setNumItems(1);
        d.heal();
        System.out.println(d.toString());
    }
}
