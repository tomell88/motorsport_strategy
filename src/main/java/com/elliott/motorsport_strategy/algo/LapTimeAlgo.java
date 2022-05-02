package com.elliott.motorsport_strategy.algo;

import com.elliott.motorsport_strategy.model.Car;
import com.elliott.motorsport_strategy.model.Track;

public class LapTimeAlgo {

    public static double getAverageLapTime(Car car, Track track) {

        double averageSpeedInKilometersPerHour = getAverageSpeedForCar(car);
        double averageSpeedInKilometersPerSecond = averageSpeedInKilometersPerHour / 3600;
        double averageSpeedInMetresPerSecond = averageSpeedInKilometersPerSecond * 1000;

        //lap time = metres / metres per second
        double averageLapTime = track.getLap().getLengthInMetres() / averageSpeedInMetresPerSecond;

        System.out.println("A car travelling " + averageSpeedInKilometersPerHour + "kph / " + averageSpeedInMetresPerSecond +
                "mps has an average lap time of " + averageLapTime + "s around a track of " + track.getLap().getLengthInMetres() + "metres");

        return averageLapTime;
    }

    /**
     * Incredibly naive implementation!
     */
    public static double getAverageSpeedForCar(Car car) {
        return 150.0;
    }

}
