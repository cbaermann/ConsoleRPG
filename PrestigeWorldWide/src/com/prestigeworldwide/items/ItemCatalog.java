package com.prestigeworldwide.items;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ItemCatalog {

    private List<Items> itemCatalog = Arrays.asList(
            new Items(1L, "Basic Health Potion", 0, "heals health by 5", ItemType.POTION)
    );
}
