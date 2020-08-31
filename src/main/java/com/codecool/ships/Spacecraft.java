package com.codecool.ships;

import com.codecool.ShipType;

import java.util.List;

public abstract class Spacecraft {
    protected final String REGISTRATION_CODE;
    protected final String NAME;
    protected final int BUILD_YEAR;
    protected ShipType shipType;

    protected Spacecraft(String registration_code, String name, int build_year) {
        REGISTRATION_CODE = registration_code;
        NAME = name;
        BUILD_YEAR = build_year;
    }

    public List<Spacecraft> getSameTypeShips(ShipType shipType){
        return null;
    }
}
