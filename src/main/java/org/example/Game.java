package org.example;

import java.util.ArrayList;


public class Game {

    private ArrayList<Player> players;
    private final Deck deck;

    public Game(){
        deck = new Deck();
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

    public void giveOutCards(){
        dishOut();
        dishOut();
    }

    public ArrayList<Player> getPlayers() {
        return players;
    }

    public void dishOut(){
        
        for (int i = 0; i < players.size(); i++){
            getPlayers().get(i).setHand(getDeck().getDeckPack().remove(0));
        }
    }

    public void addPlayer(Player player){
        players.add(player);

    }

    public Deck getDeck() {
        return deck;
    }
}
