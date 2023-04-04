package org.example;

public class Main {
    public static void main(String[] args) {
        Game newGame = new Game();
        newGame.startGame();

        for(int i = 0; i < newGame.getPlayers().size(); i++) {
            System.out.println(newGame.getPlayers().get(i).calcHandValue());
        }
    }
}
