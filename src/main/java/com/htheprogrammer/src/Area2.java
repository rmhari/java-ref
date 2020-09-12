package com.htheprogrammer.src;//Write a program to print the area of a rectangle by creating a
// class named 'Area' having two methods.
// First method named as 'setDim' takes length and breadth of rectangle as parameters
// and the second method named as 'getArea' returns the area of the rectangle.
// Length and breadth of rectangle are entered through keyboard.

import java.util.Scanner;

public class Area2 {

    int length,breadth;
    Area2(int l, int b){
        length = l;
        breadth = b;
    }
    public int setDim(){
        int result = length * breadth;
        return result;
    }
    public void getArea(){
        System.out.println("Area = " +  setDim());
    }
    public static void main(String []args){
        Scanner s = new Scanner(System.in);
        int l , b;

        System.out.println("Length: " );
        l = s.nextInt();
        System.out.println("Breadth: " );
        b = s.nextInt();

        Area2 area2 =new Area2(l, b);
        area2.getArea();

    }
}
