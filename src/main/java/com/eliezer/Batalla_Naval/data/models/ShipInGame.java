package com.eliezer.Batalla_Naval.data.models;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class ShipInGame {
    private final ShipInfo shipInfo;
    private final ArrayList<Position> positions = new ArrayList<>();
    private String status;

    public ShipInGame(ShipInfo shipInfo)
    {
        this.shipInfo = shipInfo;
    }

    public ShipInfo getShipInfo() {
        return shipInfo;
    }

    public ArrayList<Position> getPositions() {
        return positions;
    }
}
