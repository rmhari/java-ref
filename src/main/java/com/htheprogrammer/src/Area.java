package com.htheprogrammer.src;//Write a program to print the area of a rectangle by creating a class named 'Area'
// taking the values of its length and breadth as parameters of its constructor
// and having a method named 'returnArea' which returns the area of the rectangle.
// Length and breadth of rectangle are entered through keyboard.

import java.util.Scanner;

class Area {
    double length;
    double breadth;

    public Area(double aLength, double aBreadth) {
        length = aLength;
        breadth = aBreadth;
    }

    public double getArea() {
        double area = this.length * this.breadth;
        return area;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int l , b;

        System.out.println("Length: " );
        l = s.nextInt();
        System.out.println("Breadth: " );
        b = s.nextInt();

        Area area = new Area( l, b);
        System.out.println("Area = " + area.getArea());
    }
}
