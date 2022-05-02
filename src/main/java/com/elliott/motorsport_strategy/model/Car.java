package com.elliott.motorsport_strategy.model;

public class Car {

    private static final double MAX_FUEL_IN_KGS = 100.0;
    private static final double BASE_WEIGHT_IN_KGS = 850.0;

    private final FuelLoad fuelLoad;

    private Tyre frontLeftTyre;
    private Tyre frontRightTyre;
    private Tyre rearLeftTyre;
    private Tyre rearRightTyre;


    public Car(double initialFuel, TyreCompound tyreCompound) {
        this.fuelLoad = new FuelLoad(MAX_FUEL_IN_KGS, initialFuel);
        this.frontLeftTyre = new Tyre(tyreCompound);
        this.frontRightTyre = new Tyre(tyreCompound);
        this.rearLeftTyre = new Tyre(tyreCompound);
        this.rearRightTyre = new Tyre(tyreCompound);
    }

    public void replaceTyres(TyreCompound tyreCompound) {
        this.frontLeftTyre = new Tyre(tyreCompound);
        this.frontRightTyre = new Tyre(tyreCompound);
        this.rearLeftTyre = new Tyre(tyreCompound);
        this.rearRightTyre = new Tyre(tyreCompound);
    }

    public Tyre getFrontLeftTyre() {
        return frontLeftTyre;
    }

    public Tyre getFrontRightTyre() {
        return frontRightTyre;
    }

    public Tyre getRearLeftTyre() {
        return rearLeftTyre;
    }

    public Tyre getRearRightTyre() {
        return rearRightTyre;
    }

    public FuelLoad getFuelLoad() {
        return fuelLoad;
    }

    public double getCurrentWeightInKilos() {
        return BASE_WEIGHT_IN_KGS;
    }

}
