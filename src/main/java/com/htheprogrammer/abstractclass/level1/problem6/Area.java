package com.htheprogrammer.abstractclass.level1.problem6;

public class Area extends Shape{
    @Override
    void rectangleArea(final Integer length, final Integer breadth) {
        System.out.println("Area of rectangle: " + length * breadth);
    }

    @Override
    void squareArea(final Integer side) {
        System.out.println("Area of square: " + side * side);
    }

    @Override
    void circleArea(final Integer radius) {
        System.out.println("Area of circle: " + 3.14 * radius * radius);
    }

    public static void main(String[] args) {
        Shape shape = new Area();
        shape.rectangleArea(10,5);
        shape.circleArea(5);
        shape.squareArea(3);
    }
}
