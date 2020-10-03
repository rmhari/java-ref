package com.htheprogrammer.methods;

public class Area {
    public void printArea(int length, int breadth) {
        System.out.println("Area of rectangle is " + length * breadth);
    }
    public void printArea(int side) {
        System.out.println("Area of square is " + side * side);
    }

    public static void main(String[] args) {
        Area a = new Area();
        a.printArea(10, 15);
        a.printArea(20);
    }
}
