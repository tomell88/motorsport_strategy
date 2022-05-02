package com.elliott.motorsport_strategy.model;

public class Lap {

    private final double lengthInMetres;

    public Lap(double lengthInMetres) {
        this.lengthInMetres = lengthInMetres;
    }

    public double getLengthInMetres() {
        return lengthInMetres;
    }
}
