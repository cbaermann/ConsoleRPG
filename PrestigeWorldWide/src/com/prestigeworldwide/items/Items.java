package com.prestigeworldwide.items;

import java.util.ArrayList;
import java.util.List;

public class Items implements Comparable<Items>{
    private String name;
    private int stats;
    private String description;
    private ItemType itemType;



    @Override
    public int compareTo(Items o) {
        return 0;
    }
}
