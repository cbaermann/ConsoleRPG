package com.prestigeworldwide.items;

import com.prestigeworldwide.players.Player;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Items implements Comparable<Items>{
    private Long id;
    private String name;
    private int stats;
    private String description;
    private ItemType itemType;

    public Items(Long id){
        this.id = id;
    }

    public Items(Long id, String name, int stats, String description, ItemType itemType){
        setId(id);
        setName(name);
        setStats(stats);
        setDescription(description);
        setItemType(itemType);
    }

    //Add items to player inventory
//    public static void addItem(findByID, Player player){
//        for (int i = 0; i < numItems; i++)
//            player.getPlayerItems().add(findByID);
//    }



    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStats() {
        return stats;
    }

    public void setStats(int stats) {
        this.stats = stats;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ItemType getItemType() {
        return itemType;
    }

    public void setItemType(ItemType itemType) {
        this.itemType = itemType;
    }

    @Override
    public int compareTo(Items o) {
        return 0;
    }

    @Override
    public String toString() {
        return "Items{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", stats=" + stats +
                ", description='" + description + '\'' +
                ", itemType=" + itemType +
                '}';
    }
}
