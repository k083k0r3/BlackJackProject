package org.example;
import java.util.ArrayList;
import java.util.Collections;

public class Deck {
    private ArrayList<Card> deckPack;

    public Deck(){
        deckPack = new ArrayList<>();
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
        return deckPack;
    }

    public void addCard(Card card){
        getDeckPack().add(card);
    }


}
