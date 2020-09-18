//Write a program to print the roll number and average marks of 8 students in three subjects (each out of 100).
// The marks are entered by user.

package com.htheprogrammer.arrays;

import java.util.Scanner;

public class StudentsMark {

    Integer roll_no;
    Integer mark1;
    Integer mark2;
    Integer mark3;

    public void getInput() {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter roll number: ");
        roll_no = s.nextInt();
        System.out.println("Mark1: ");
        mark1 = s.nextInt();
        System.out.println("Mark2: ");
        mark2 = s.nextInt();
        System.out.println("Mark3: ");
        mark3 = s.nextInt();
    }

    public void displayAverage() {
        System.out.println("Roll_number: " + roll_no);
        System.out.println("Average: " + (mark1 + mark2 + mark3) / 3);
    }

    public static void main(String[] args) {
        StudentsMark[] sm = new StudentsMark[3];

        for (int i = 0; i <= 2; i++) {
            sm[i] = new StudentsMark();
            sm[i].getInput();
        }

        for (int i = 0; i <= 2 ; i++) {
            sm[i].displayAverage();
        }
    }
}
