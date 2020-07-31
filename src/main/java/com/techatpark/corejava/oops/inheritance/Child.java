/*
 * Copyright (c) Haripriya
 */

package com.techatpark.corejava.oops.inheritance;

public class Child implements Three {

    @Override
    public void print_we() {
        System.out.println("We use cars like");
    }

    @Override
    public void print_car1() {
        System.out.println("Bolero, for long trips");
    }

    @Override
    public void print_car2() {
        System.out.println("Alto, for city rides");
    }
}
