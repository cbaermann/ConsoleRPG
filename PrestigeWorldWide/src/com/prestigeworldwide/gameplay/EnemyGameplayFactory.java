package com.prestigeworldwide.gameplay;

import com.prestigeworldwide.enemies.Enemy;
import com.prestigeworldwide.enemies.RoomOneEnemy;
import com.prestigeworldwide.enemies.RoomThreeEnemy;
import com.prestigeworldwide.enemies.RoomTwoEnemy;

public class EnemyGameplayFactory {
    private EnemyGameplayFactory() {
    }

    public static Enemy createEnemy(int currentRoom){
        Enemy enemy = null;
        if(currentRoom == 1){
            enemy = new RoomOneEnemy();
        }
        if(currentRoom == 2){
            enemy = new RoomTwoEnemy();
        }
        if(currentRoom == 3){
            enemy = new RoomThreeEnemy();
        }
        //not working. If this calls choosePlayer again, it will not let you chose a new player.
//        else{
//            PlayerScanner ps = new PlayerScanner();
//            System.out.println("You must choose an option of 1, 2 or 3.");
//            ps.chosePlayer();
//        }

        return enemy;
    }
}
