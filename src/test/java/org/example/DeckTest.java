package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class DeckTest {

    @Mock
    Deck deckMock = mock(Deck.class);
    @BeforeEach
    public void setUp(){
        Game game = new Game();
        game.startGame();
    }

    @Test
    void testDeckCreation(){
        ArrayList<Card> deckPack = new ArrayList<>();
        when(deckMock.getDeckPack()).thenReturn(deckPack);
        assertEquals(deckMock.getDeckPack(), deckPack);
        verify(deckMock, times(1)).getDeckPack();
    }



}