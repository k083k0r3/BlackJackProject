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
class PlayerTest {

    @Mock
    Player playerMock = mock(Player.class);

    @BeforeEach
    public void setUp(){
        Game game = new Game();
        game.startGame();
    }

    @Test
    public void calcHandValueTest(){
        when(playerMock.calcHandValue()).thenReturn(10);
        assertEquals(10, playerMock.calcHandValue());
        verify(playerMock, times(1)).calcHandValue();
    }

    @Test
    public void getHandTest(){
        ArrayList<Card> playerHand = new ArrayList<>();
        when(playerMock.getHand()).thenReturn(playerHand);
        assertEquals(playerHand, playerMock.getHand());
        verify(playerMock, times(1)).getHand();
    }
}