package com.htheprogrammer.classesandobjects;//problem 5.

class Rectangle {
    double length;
    double breadth;

    public Rectangle(double aLength, double aBreadth) {
        length = aLength;
        breadth = aBreadth;
    }

    public double area() {
        double area;
        return area = length * breadth;
    }

    public static void main(String[] args) {
        Rectangle rect1 = new Rectangle(4, 5);
        System.out.println("Area of first Rectangle " + rect1.area());
        Rectangle rect2 = new Rectangle(5, 8);
        System.out.println("Area of second Rectangle " + rect2.area());

    }
}
