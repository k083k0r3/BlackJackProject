package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PlayerTest {

    @Test
    void createPlayerHand(){
        Player newPlayer = new Player();
        assertTrue(newPlayer.getHand().size() == 0);
    }

}