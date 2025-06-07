package com.eliezer.Batalla_Naval.data.models;

public class ShipInGame {
    private final ShipInfo shipInfo;
    private Position position0;
    private Position position1;
    public ShipInGame(ShipInfo shipInfo)
    {
        this.shipInfo = shipInfo;
    }

    public ShipInfo getShipInfo() {
        return shipInfo;
    }

    public void setPosition0(Position position0) {
        this.position0 = position0;
    }

    public void setPosition1(Position position1) {
        this.position1 = position1;
    }

    public Position getPosition0() {
        return position0;
    }

    public Position getPosition1() {
        return position1;
    }
}
