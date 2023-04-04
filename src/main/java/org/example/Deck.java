package org.example;
import java.util.ArrayList;

public class Deck {
    private final ArrayList<Card> deckPack;

    public Deck(){
        deckPack = new ArrayList<>();
        for (Suit suit : Suit.values()){
            for (Rank rank : Rank.values()){
                addCard(new Card(rank, suit));
            }
        }
    }


    public ArrayList<Card> getDeckPack(){
        return deckPack;
    }

    public void addCard(Card card){
        getDeckPack().add(card);
    }


}
