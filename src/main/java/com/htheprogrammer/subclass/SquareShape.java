package com.htheprogrammer.subclass;

public class SquareShape extends RectangleShape{

    public void print() {
        System.out.println("Square is a rectangle shape");
    }

    public static void main(String[] args) {
        RectangleShape s = new RectangleShape();
        s.method();
        s.print();
        RectangleShape r = new SquareShape();
        r.print();
    }
}
