package com.techatpark.corejava.oops;

public class TandemBike implements Bycycle{

    int cadence = 2;
    int speed = 4;
    int gear = 1;
    int seats = 1;

    @Override
    public void changeCadence(int newValue) {
        cadence = newValue;
    }

    @Override
    public void changeGear(int newValue) {
        gear = newValue;
    }

    @Override
    public void speedUp(int increment) {
        speed = speed + increment;
    }

    @Override
    public void applyBrakes(int decrement) {
        speed = speed - decrement;
    }

    void seats(int newValue){
        seats = newValue;
    }

    void printStates() {
        System.out.println("cadence:" +
                cadence + " speed:" +
                speed + " gear:" + gear + " seats:" + seats);
    }
}
