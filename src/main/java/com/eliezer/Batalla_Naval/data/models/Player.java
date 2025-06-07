package com.eliezer.Batalla_Naval.data.models;

public class Player {
    private final int id;
    private String name;

    public Player(int id)
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
