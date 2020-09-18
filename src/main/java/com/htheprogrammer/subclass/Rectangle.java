package com.htheprogrammer.subclass;

public class Rectangle {
    int length;
    int breadth;

    public Rectangle(int aLength, int aBreadth) {
        length = aLength;
        breadth = aBreadth;
    }

    public void area() {
        System.out.println(length * breadth);
    }

    public void perimeter() {
        System.out.println((2 * length) + (2 * breadth));
    }
}
