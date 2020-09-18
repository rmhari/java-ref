//Write a program to calculate the average height of all the students of a class.
// The number of students and their heights in a class are entered by user.

package com.htheprogrammer.arrays;

import java.util.Scanner;

public class Height {

    public static void main(String[] args) {

            System.out.println("How many students:");
            Scanner scanner = new Scanner(System.in);
            int noOfStudents = scanner.nextInt();
            /* Declaring array of n elements, the value
             * of n is provided by the user
             */
            double[] array = new double[noOfStudents];
            double total = 0;

            for(int i=0; i<array.length; i++){
                System.out.print("Enter Height"+(i+1)+": ");
                array[i] = scanner.nextDouble();
            }
            scanner.close();
            for(int i=0; i<array.length; i++){
                total = total + array[i];
            }

            double average = total / array.length;

            System.out.format("The average is: %.3f", average);
        }
}
