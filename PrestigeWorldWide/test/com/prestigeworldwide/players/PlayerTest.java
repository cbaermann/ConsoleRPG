package com.prestigeworldwide.players;

import com.prestigeworldwide.enemies.Enemy;
import com.prestigeworldwide.enemies.RoomThreeEnemy;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PlayerTest {
    private Player player1;
    private Enemy enemy1;
    @Before
    public void init(){
        player1 = new Dale();
        enemy1 = new RoomThreeEnemy();
    }
    @Test
    public void testPlayerHealth(){
        assertEquals(9, player1.getHealth());
    }

    @Test
    public void testPlayerAttack() {
        assertEquals(-5, player1.playerAttack(enemy1), .001);
    }
    @Test
    public void testPlayerDefend() {
        assertEquals(2, player1.playerDefend(enemy1), .001);
    }
    @Test
    public void testPlayerHeal() {
        assertEquals(14, player1.playerHeal(), .001);
    }
}