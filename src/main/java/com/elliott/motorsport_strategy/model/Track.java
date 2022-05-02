package com.elliott.motorsport_strategy.model;

public class Track {

    private final String name;
    private final Lap lap;

    public Track(String name, Lap lap) {
        this.name = name;
        this.lap = lap;
    }

    public String getName() {
        return name;
    }

    public Lap getLap() {
        return lap;
    }
}
