package com.htheprogrammer.random;

import java.util.Scanner;

public class Pyramid {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number of rows:");
        int no_of_rows = s.nextInt();
        int rowCount = 1;
        System.out.println("Here is the pyramid");

        for (int i = no_of_rows; i > 0; i--) {

            //printing space
            for (int j = 1; j <= i; j++) {
                System.out.print(" ");
            }

            //printing number
            for (int j = 1; j <= rowCount; j++) {
                System.out.print(rowCount + " ");
            }


            System.out.println(" ");
            rowCount++;

        }
    }
}
