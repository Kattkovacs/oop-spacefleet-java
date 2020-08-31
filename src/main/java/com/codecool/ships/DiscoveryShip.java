package com.codecool.ships;

import com.codecool.ShipType;

public class DiscoveryShip extends Spacecraft implements Dockable {
    private final int maxSpeedStat;

    public DiscoveryShip(String REGISTRATION_CODE, String NAME,
                         int BUILD_YEAR, ShipType shipType, int maxSpeedStat) {
        super(REGISTRATION_CODE, NAME, BUILD_YEAR);
        this.shipType = shipType;
        this.maxSpeedStat = BUILD_YEAR >= 2200 ? maxSpeedStat + 15: maxSpeedStat -30 ;
    }
}
