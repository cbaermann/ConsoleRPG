package com.prestigeworldwide.items;

import java.util.Arrays;
import java.util.List;

public class ItemCatalog {

    private List<Items> itemCatalog = Arrays.asList(

            new Items(1L, "Small Health Potion", 5, "heals health by 5", ItemType.POTION),
            new Items(2L, "Regular Health Potion", 15, "heals health by 15", ItemType.POTION),
            new Items(3L, "Super Health Potion", 25, "heals health by 25", ItemType.POTION),
            new Items(4L, "Drum Stick", 5, "enemy health damaged by 5", ItemType.WEAPON),
            new Items(5L, "Golf Club", 15, "enemy health damaged by 15", ItemType.WEAPON),
            new Items(6L, "Pistol", 25, "enemy health damaged by 25", ItemType.WEAPON),
            new Items(7L, "Small Shield", 5, "increases defense by 5", ItemType.SHIELD),
            new Items(8L, "Wooden Shield", 15, "increases defense by 15", ItemType.SHIELD),
            new Items(9L, "Iron Shield", 25, "increases defense by 25", ItemType.SHIELD),
            new Items(10L, "Elixir", 50, "watched COPS - health healed by 50", ItemType.RARE),
            new Items(11L, "VK-47 Flatline Rifle", 50, "enemy health damaged by 50", ItemType.RARE),
            new Items(12L, "Force Field", 50, "increases defense by 50", ItemType.RARE)
    );

}
