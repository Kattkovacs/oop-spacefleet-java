package com.codecool;

import com.codecool.ships.Spacecraft;

import java.util.HashSet;
import java.util.Set;

public class SpacecraftController {
    private Set<Spacecraft> spacecrafts = new HashSet<>();

    public Set<Spacecraft> getSpacecrafts() {
        return this.spacecrafts;
    }

    public void addSpacecrafts(Spacecraft spacecraft){
        spacecrafts.add(spacecraft);
        spacecrafts.add(spacecraft);
    }
}
