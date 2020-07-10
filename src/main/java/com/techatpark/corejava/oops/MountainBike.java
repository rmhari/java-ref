package com.techatpark.corejava.oops;

public class MountainBike extends Bicycle{

    int lowgear = 1;

    void changeLowGear(int newValue) {
        lowgear = newValue;
    }
    void printStates() {
        System.out.println("cadence:" + cadence + " speed:" + speed + " gear:" + gear + " lowgear:" + lowgear);
    }

}
