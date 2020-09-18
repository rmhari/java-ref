package com.htheprogrammer.subclass;

public class Square extends Rectangle{
    public Square(int s) {
        super(s, s);
    }

    @Override
    public void perimeter() {

        System.out.println(4 * length);
    }

    public static void main(String[] args) {
        Rectangle r = new Rectangle(10, 15);
        r.area();
        r.perimeter();

        Square s = new Square(20);
        s.area();
        s.perimeter();

        Square[] square = new Square[10];
        int side = 5;
        for (int i = 0; i < 10; i++) {
            square[i] = new Square(side);
            side++;
        }

        for (int i = 0; i < 10; i++) {
            square[i].area();
            square[i].perimeter();
        }
    }
}
