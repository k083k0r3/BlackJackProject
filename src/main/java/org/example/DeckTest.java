package org.example;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import static org.junit.jupiter.api.Assertions.*;

class DeckTest {

    @Test
    void deckSupposeReturn52(){
        Deck newDeck = new Deck();
        assertTrue(newDeck.getDeckPack().size() == 52);
    }



}