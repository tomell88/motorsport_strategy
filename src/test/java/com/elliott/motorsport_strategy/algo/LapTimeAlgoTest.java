package com.elliott.motorsport_strategy.algo;

import com.elliott.motorsport_strategy.model.Car;
import com.elliott.motorsport_strategy.model.Lap;
import com.elliott.motorsport_strategy.model.Track;
import com.elliott.motorsport_strategy.model.TyreCompound;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LapTimeAlgoTest {

    @Test
    public void testAverageLap() {
        Car car = new Car(100.0, TyreCompound.SOFT);
        Track track = new Track("Silverstone", new Lap(4250));
        assertEquals(102.0, LapTimeAlgo.getAverageLapTime(car, track));
    }

}
