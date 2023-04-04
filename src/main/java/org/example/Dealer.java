package org.example;

import java.util.ArrayList;
import java.util.Collections;

public class Dealer {

    public Dealer(){}

    public void dishOut(Deck cards, ArrayList<Player> players, int howManyCardsPerPlayer){
        for (Player player : players) {
            for (int numOfCards = 0; numOfCards < howManyCardsPerPlayer; numOfCards++) {
                player.setHand(cards.getDeckPack().remove(0));
            }

        }
    }

    public void shuffleDeck(Deck cards){
        Collections.shuffle(cards.getDeckPack());
    }
}
