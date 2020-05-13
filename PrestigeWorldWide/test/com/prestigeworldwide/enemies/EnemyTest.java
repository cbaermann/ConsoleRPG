package com.prestigeworldwide.enemies;

import com.prestigeworldwide.players.Brennan;
import com.prestigeworldwide.players.Player;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class EnemyTest {

    Enemy enemy1;
    Player player1;

    @Before
    public void init(){
        enemy1 = new RoomOneEnemy();
        player1 = new Brennan();
    }
    @Test
    public void testEnemyAttributes(){
        assertEquals(4, enemy1.getDefence(), .001);
        assertEquals(13, enemy1.getHealth(), .001);
        assertEquals(3, enemy1.getStrength(), .001);
        assertEquals("Robert", enemy1.getName());
    }

    @Test
    public void testEnemyAttack(){
        assertEquals(4, enemy1.enemyAttack(player1), .001);
    }
    @Test
    public void testEnemyDefence(){
        assertEquals(2, enemy1.enemyDefend(player1), .001);
    }

    @Test
    public void testEnemyHeal(){
        assertEquals(18, enemy1.enemyHeal(), .001);
    }
}
