package org.example;

import java.util.ArrayList;

public class Player {
    private ArrayList<Card> hand;
    private int handValue = 0;
    private String id;

    public Player(){
        //this.id = id;
        hand = new ArrayList<>();
    }

    public ArrayList<Card> getHand(){
        return hand;
    }

    public int calcHandValue(){
        System.out.println("Cards:");
        for (Card card : hand){
            System.out.println(card + "=" + card.getRank().value + " ");
            handValue += card.getRank().value;
        }
        System.out.println("total " + handValue);
        return handValue;
    }

    public void setHand(Card card) {
        hand.add(card);
    }

    public String toString(){
        return "First Card : " + hand.get(0) + " Second Card: " + hand.get(1);
    }
}