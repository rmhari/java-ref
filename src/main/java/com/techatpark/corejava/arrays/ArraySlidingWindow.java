/*
 * Copyright (c) Haripriya
 */

package com.techatpark.corejava.arrays;

public class ArraySlidingWindow {
    public static int slidingWindow(int[] array, int window, int n, int op) {
        for (int i = 0; i < n - 3; i++) {
            int total = array[i] + array[i + 1] + array[i + 2];
            if (total == op) {
                return i;
            }
        }
        return -1;
    }
}


