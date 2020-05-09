package com.prestigeworldwide.items;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ItemCatalog {

    public List<Items> itemCatalog = Arrays.asList(
            new Items(1L, "Basic Health Potion", 5, "heals health by 5", ItemType.POTION)
    );
}
