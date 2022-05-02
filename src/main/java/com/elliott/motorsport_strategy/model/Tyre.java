package com.elliott.motorsport_strategy.model;

public class Tyre {

    private static final double BASE_TEMPERATURE_IN_CELSIUS = 27.4;

    private final TyreCompound tyreCompound;
    private double percentageLifeRemaining;
    private double currentTemperatureInCelsius;

    public Tyre(TyreCompound tyreCompound) {
        this.tyreCompound = tyreCompound;
        this.percentageLifeRemaining = 100.0;
        this.currentTemperatureInCelsius = BASE_TEMPERATURE_IN_CELSIUS;
    }

    public void setPercentageLifeRemaining(double percentageLifeRemaining) {
        this.percentageLifeRemaining = percentageLifeRemaining;
    }

    public void setCurrentTemperatureInCelsius(double currentTemperatureInCelsius) {
        this.currentTemperatureInCelsius = currentTemperatureInCelsius;
    }

    public TyreCompound getTyreCompound() {
        return tyreCompound;
    }

    public double getPercentageLifeRemaining() {
        return percentageLifeRemaining;
    }

    public double getCurrentTemperatureInCelsius() {
        return currentTemperatureInCelsius;
    }
}
