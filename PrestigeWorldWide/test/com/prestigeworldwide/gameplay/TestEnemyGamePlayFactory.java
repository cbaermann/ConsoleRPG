package com.prestigeworldwide.gameplay;
import com.prestigeworldwide.enemies.Enemy;
import com.prestigeworldwide.enemies.RoomOneEnemy;
import com.prestigeworldwide.enemies.RoomThreeEnemy;
import com.prestigeworldwide.enemies.RoomTwoEnemy;
import org.junit.Before;
import org.junit.Test;

import javax.swing.text.rtf.RTFEditorKit;

import static org.junit.Assert.*;


public class TestEnemyGamePlayFactory {
    private int room1;
    private int room2;
    private int room3;

    @Before
    public void init(){
        room1 = 1;
        room2 = 2;
        room3 = 3;
    }

    @Test
    public void TestNewRoomOneEnemyInstance(){
        Enemy e = EnemyGameplayFactory.createEnemy(room1);
        assertEquals(RoomOneEnemy.class, e.getClass());
    }

    @Test
    public void TestNewRoomTwoEnemyInstance(){
        Enemy e = EnemyGameplayFactory.createEnemy(room2);
        assertEquals(RoomTwoEnemy.class, e.getClass());
    }

    @Test
    public void TestNewRoomThreeEnemyInstance(){
        Enemy e = EnemyGameplayFactory.createEnemy(room3);
        assertEquals(RoomThreeEnemy.class, e.getClass());
    }

}
