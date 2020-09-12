package com.htheprogrammer.src;
//Add two distances in inch-feet by creating a class named 'AddDistance'.

import java.util.Scanner;

class AddDistance {
    private int feet;
    private int inches;

    public void getDistance() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter feet: ");
        feet = sc.nextInt();
        System.out.print("Enter inches: ");
        inches = sc.nextInt();
    }

    public void showDistance() {
        System.out.println("Feet: " + feet + "\tInches: " + inches);
    }

    public void addDistance(AddDistance D1, AddDistance D2) {
        inches = D1.inches + D2.inches;
        feet = D1.feet + D2.feet + (inches / 12);
        inches = inches % 12;
    }

    public static void main(String[] args) {
        AddDistance D1 = new AddDistance();
        AddDistance D2 = new AddDistance();
        AddDistance D3 = new AddDistance();

        //read first distance
        System.out.println("Enter first distance: ");
        D1.getDistance();

        //read second distance
        System.out.println("Enter second distance: ");
        D2.getDistance();

        //add distances
        D3.addDistance(D1, D2);
        //print distance
        System.out.println("Total distance is:");
        D3.showDistance();
    }

}
