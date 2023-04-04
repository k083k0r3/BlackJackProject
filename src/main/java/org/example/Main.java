package org.example;

public class Main {
    public static void main(String[] args) {
        Game newGame = new Game();
        newGame.giveOutCards();
        System.out.println(newGame.getPlayers().get(0).calcHandValue());
        System.out.println(newGame.getPlayers().get(1).calcHandValue());
        System.out.println(newGame.getPlayers().get(2).calcHandValue());
    }
}
