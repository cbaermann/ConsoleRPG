package com.prestigeworldwide.clinet;

import com.prestigeworldwide.players.Dwarf;
import com.prestigeworldwide.players.Elf;
import com.prestigeworldwide.players.Player;
import com.prestigeworldwide.players.Wizard;

public class PrestigeWorldWideClient {
    public static void main(String[] args) {
        Player d = new Elf();
        System.out.println(d.toString());
        d.setNumItems(1);
        d.heal();
        System.out.println(d.toString());
    }
}
