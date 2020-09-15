//problem 3, 4
package com.htheprogrammer.classesandobjects;
class Triangle {

    int a,b,c;

    public Triangle(int sideA, int sideB, int sideC) {
        a = sideA;
        b = sideB;
        c = sideC;
    }

    public double area() {
       double side = (a + b + c )/2.0; //perimeter
       return Math.pow((side*(side-a)*(side-b)*(side-c)),0.5);
    }

    public double perimeter() {
        return (a + b + c )/2.0;
    }

    public static void main(String[] args) {
        Triangle t = new Triangle(3, 4, 5);
//        t.a = 3;
//        t.b = 4;
//        t.c = 5;
        System.out.println("Area " + t.area() + " , Perimeter " + t.perimeter());
    }

}
