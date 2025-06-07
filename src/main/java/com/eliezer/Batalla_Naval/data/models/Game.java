package com.eliezer.Batalla_Naval.data.models;

public class Game {
    private final int id;
    private Player player1;
    private Player player2;
    public Game(int id)
    {
        this.id = id;
    }

    public void setPlayer1(Player player1) {
        this.player1 = player1;
    }

    public void setPlayer2(Player player2) {
        this.player2 = player2;
    }

    public Player getPlayer1() {
        return player1;
    }

    public Player getPlayer2() {
        return player2;
    }

    public int getId() {
        return id;
    }
}
