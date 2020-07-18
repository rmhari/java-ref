/*
 * Copyright (c) Haripriya
 * check whether the array has one element or no element,then array is sorted.
 * Else check every array element is smaller than the next element.if s, array is sorted.
 * Time complexity = O(n).
 */

package com.techatpark.corejava.arrays;

public class ArraySortCheck {

    public static boolean isSorted(int[] array, int numofelements) {

        if (numofelements == 0 || numofelements == 1) {
            return true;
        }
        for (int i = 1; i < numofelements; i++) {

            // Unsorted pair found
            if (array[i] < array[i - 1]) {
                return false;
            }
        }
        // No unsorted pair found
        return true;
    }
}
