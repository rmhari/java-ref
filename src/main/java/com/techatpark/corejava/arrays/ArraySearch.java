/*
 * Copyright (c) Haripriya
 * Time complexity is O(n), Bcz it has best ,worst , average case.
 * So its upperbound. hence O(n).
 */


package com.techatpark.corejava.arrays;

public class ArraySearch {

    public static int search(int[] arr, int n, int item) {
        for (int i = 0; i < n; i++) {
            if (arr[i] == item) {
                return arr[i];
            }
        }
        return -1;
    }

    public static int check(int[] arr, int item) {
        for (int element : arr) {
            if (element == item) {
                break;
            }
        }
        return item;
    }
}
