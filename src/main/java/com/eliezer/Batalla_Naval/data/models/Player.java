package com.eliezer.Batalla_Naval.data.models;

import java.awt.*;

public class Player {
    private final PlayerInfo playerInfo;
    private String color;
    public Player(PlayerInfo playerInfo)
    {
        this.playerInfo = playerInfo;
    }

    public PlayerInfo getPlayerInfo() {
        return playerInfo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
