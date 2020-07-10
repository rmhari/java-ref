package com.techatpark.corejava.oops;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MountainBikeTest {

    @Test
    void testMountainBike() {
        Bicycle bicycle = new Bicycle();
        MountainBike mountainBike = new MountainBike();
       // mountainBike.changeLowGear(3);
        mountainBike.printStates();
    }
}