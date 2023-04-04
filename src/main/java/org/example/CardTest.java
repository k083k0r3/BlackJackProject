package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CardTest {

    //Test for creation of Card Object
    @Test
    //given
    void getCardRank(){
        Card newCard = new Card(Rank.ACE,Suit.DIAMONDS);
        assertEquals(newCard.getRank(), Rank.ACE);

    }

    @Test
    void getCardSuit(){
        Card newCard = new Card(Rank.KING, Suit.HEARTS);
        assertFalse(newCard.getSuit() == Suit.DIAMONDS);
    }

}