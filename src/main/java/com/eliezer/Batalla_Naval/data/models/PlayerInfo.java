package com.eliezer.Batalla_Naval.data.models;

public class PlayerInfo {
    private final int id;
    private String name;

    public PlayerInfo(int id)
    {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
