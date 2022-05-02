package com.elliott.motorsport_strategy.model;

import java.util.ArrayList;
import java.util.List;

public class Race {

    private final String name;
    private final Track track;
    private final int numberOfLaps;
    private final List<Car> entries;

    public Race(String name, Track track, int numberOfLaps) {
        this.name = name;
        this.track = track;
        this.numberOfLaps = numberOfLaps;
        this.entries = new ArrayList<>();
    }

    public void addEntry(Car car) {
        this.entries.add(car);
    }

    public List<Car> getEntries() {
        return entries;
    }

    public String getName() {
        return name;
    }

    public Track getTrack() {
        return track;
    }

    public int getNumberOfLaps() {
        return numberOfLaps;
    }
}
