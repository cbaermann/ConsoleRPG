package com.prestigeworldwide.gameplay;


import com.prestigeworldwide.players.Brennan;
import com.prestigeworldwide.players.Dale;
import com.prestigeworldwide.players.Nancy;
import com.prestigeworldwide.players.Player;
import org.junit.Before;
import org.junit.Test;

import java.time.format.SignStyle;

import static org.junit.Assert.*;
public class TestPlayerGamePlayFactory {

    private String brennon;
    private String nancy;
    private String dale;


    @Before
    public void init(){
        brennon = "1";
        nancy = "2";
        dale = "3";
    }
    @Test
    public void testCreatingABrennanInstance(){
        Player p = PlayerGameplayFactory.createPlayer(brennon);
        assertEquals(Brennan.class, p.getClass());
    }

    @Test
    public void testCreatingANancyInstance(){
        Player p = PlayerGameplayFactory.createPlayer(nancy);
        assertEquals(Nancy.class, p.getClass());
    }

    @Test
    public void testCreatingADaleInstance(){
        Player p = PlayerGameplayFactory.createPlayer(dale);
        assertEquals(Dale.class, p.getClass());
    }

}
