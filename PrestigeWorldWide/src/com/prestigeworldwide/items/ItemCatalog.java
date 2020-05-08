package com.prestigeworldwide.items;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ItemCatalog {

    private List<Items> itemCatalog = Arrays.asList(
            new Items(1L, "Small Health Potion", 5, "heals health by 5", ItemType.POTION),
            new Items(2L, "Regular Health Potion", 15, "heals health by 15", ItemType.POTION),
            new Items(3L, "Super Health Potion", 25, "heals health by 25", ItemType.POTION),
            new Items(4L, "Golf Club", 10, "heals health by 5", ItemType.POTION),
            new Items(5L, "Pistol", 0, "heals health by 5", ItemType.POTION),
            new Items(6L, "Basic Health Potion", 0, "heals health by 5", ItemType.POTION)


    );
}
