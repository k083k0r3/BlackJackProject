package org.example;

import java.util.ArrayList;
import java.util.Collections;

public class Deck {
    private ArrayList<Card> deck;

    public Deck(){
        deck = new ArrayList<>();
        for (Suit suit : Suit.values()){
            for (Rank rank : Rank.values()){
                addCard(new Card(rank, suit));
            }
        }
        shuffleCards();
    }

    public void shuffleCards(){
        Collections.shuffle(getDeckPack());
    }

    public ArrayList<Card> getDeckPack(){
        return deck;
    }

    public void addCard(Card card){
        deck.add(card);
    }


}
