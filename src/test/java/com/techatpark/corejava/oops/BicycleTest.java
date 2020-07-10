package com.techatpark.corejava.oops;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BicycleTest {
    @Test
    void testBicycle() {
        Bicycle bicycle = new Bicycle();
        bicycle.changeCadence(3);
        bicycle.printStates();
    }
}