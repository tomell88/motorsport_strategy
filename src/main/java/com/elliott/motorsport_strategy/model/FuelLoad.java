package com.elliott.motorsport_strategy.model;

public class FuelLoad {

    private final double fullFuelInKilos;
    private double currentFuelInKilos;

    public FuelLoad(double fullFuelInLitres, double currentFuelInLitres) {
        this.fullFuelInKilos = fullFuelInLitres;
        this.currentFuelInKilos = currentFuelInLitres;
    }

    public void setCurrentFuelInKilos(double currentFuelInKilos) {
        this.currentFuelInKilos = currentFuelInKilos;
    }

    public double getFullFuelInKilos() {
        return fullFuelInKilos;
    }

    public double getCurrentFuelInKilos() {
        return currentFuelInKilos;
    }
}
