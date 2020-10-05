package com.htheprogrammer.random;

import java.util.Scanner;

public class SecondLargestNumberinArray {
    public static int getSecondLargest(int[] a) {
        int temp;
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] > a[j]) {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        return a[a.length - 2];
    }

    public static void main(String args[]) {
        int n, sum = 0;

        Scanner s = new Scanner(System.in);

        System.out.print("Enter no. of elements you want in array:");

        n = s.nextInt();

        int a[] = new int[n];

        System.out.println("Enter all the elements:");

        for (int i = 0; i < n; i++) {

            a[i] = s.nextInt();
        }

        System.out.println("Second Largest: " + getSecondLargest(a));
        // System.out.println("Second Largest: "+getSecondLargest(b));
    }
}
