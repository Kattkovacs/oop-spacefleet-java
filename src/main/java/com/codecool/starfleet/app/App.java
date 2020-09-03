package com.codecool.starfleet.app;

import com.codecool.SpacecraftController;
import com.codecool.ships.CargoShip;
import com.codecool.ships.DiscoveryShip;

import static com.codecool.ShipType.CARGO_SHIP;
import static com.codecool.ShipType.DISCOVERY_SHIP;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        SpacecraftController spacecraftController = new SpacecraftController();
        spacecraftController.addSpacecrafts(new CargoShip("cs1", "CargoKing", 2152, CARGO_SHIP, 150));
        spacecraftController.addSpacecrafts(new DiscoveryShip("ds1", "DiscoveryOne", 2201, DISCOVERY_SHIP, 450));
    }
}
