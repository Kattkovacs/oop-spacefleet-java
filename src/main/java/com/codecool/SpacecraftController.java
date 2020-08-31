package com.codecool;

import com.codecool.ships.CargoShip;
import com.codecool.ships.DiscoveryShip;
import com.codecool.ships.Spacecraft;
import java.util.Set;

import static com.codecool.ShipType.CARGO_SHIP;
import static com.codecool.ShipType.DISCOVERY_SHIP;

public class SpacecraftController {
    private Set<Spacecraft> spacecrafts;

    public Set<Spacecraft> getSpacecrafts() {
        return this.spacecrafts;
    }

    public void addSpacecrafts(){
        spacecrafts.add(new CargoShip("cs1", "CargoKing", 2152, CARGO_SHIP, 150));
        spacecrafts.add(new DiscoveryShip("ds1", "DiscoveryOne", 2201, DISCOVERY_SHIP, 450));
    }
}
