package com.htheprogrammer.abstractclass.level1.problem7;


public class Area extends Shape {
    public static void main(String[] args) {
        Shape[] shape = new Area[4];
        shape[0].rectangleArea(10, 5);
        shape[1].rectangleArea(15, 10);
        shape[2].rectangleArea(3, 6);
        shape[3].rectangleArea(2, 10);

        shape[0].circleArea(5);
        shape[1].circleArea(5);
        shape[2].circleArea(5);
        shape[3].circleArea(5);

        shape[0].squareArea(3);
        shape[1].squareArea(3);
        shape[2].squareArea(3);
        shape[3].squareArea(3);

    }

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
}

