package org.example;

import java.util.ArrayList;
import java.util.Scanner;


public class Game {
    private ArrayList<Player> players;
    private final Deck deck;
    private final Dealer dealer;
    private final int numOfCardsPerPlayer = 2;

    //private int numOfPlayers;

    public Game(){
        deck = new Deck();
        dealer = new Dealer();
        players = new ArrayList<>();
        while(players.size() == 0){
            Player player1 = new Player();
            Player player2 = new Player();
            Player player3 = new Player();
            addPlayer(player1);
            addPlayer(player2);
            addPlayer(player3);
        }
    }

    public ArrayList<Player> getPlayers() {
        return players;
    }

    public void addPlayer(Player player){
        players.add(player);

    }

    public Deck getDeck() {
        return deck;
    }

    public Dealer getDealer() {
        return dealer;
    }

    public int getNumOfCardsPerPlayer() {
        return numOfCardsPerPlayer;
    }

    public void startGame(){
        getDealer().shuffleDeck(deck);
        getDealer().dishOut(getDeck(), getPlayers(), getNumOfCardsPerPlayer());
        for (Player player : getPlayers()){
            player.calcHandValue();
        }
    }
}
