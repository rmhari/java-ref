package com.techatpark.corejava.oops;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TandemBikeTest {
    @Test
    void testTandemBike() {

        TandemBike tandemBike = new TandemBike();
        tandemBike.seats(3);
        tandemBike.printStates();
    }

}