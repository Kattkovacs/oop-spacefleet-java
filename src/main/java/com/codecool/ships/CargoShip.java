package com.codecool.ships;

import com.codecool.ShipType;


public class CargoShip extends Spacecraft {
    private int maxSpeedStat = 150;

    public CargoShip(String REGISTRATION_CODE, String NAME,
                     int BUILD_YEAR, ShipType shipType, int maxSpeedStat) {
        super(REGISTRATION_CODE, NAME, BUILD_YEAR);
        this.shipType = shipType;
        this.maxSpeedStat = maxSpeedStat;
    }

    @Override
    public String toString() {
        return "Cargo Ship";
    }
}
