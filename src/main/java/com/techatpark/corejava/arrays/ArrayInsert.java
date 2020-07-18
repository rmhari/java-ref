/*
 * Copyright (c) Haripriya
 * Here we check the capacity of array.if its full,return no.of.elements.
 * if not, move each element to new location till we reach the position to insert.
 * then insert in the position requested.
 * time complexity = O(n), best and worst case avail.
 */

package com.techatpark.corejava.arrays;

public class ArrayInsert {

    public static int insert(int[] array, int numofelements, int capacityofarray, int position, int item) {
        if(numofelements == capacityofarray) {
            return numofelements;
        }
        for (int i=numofelements-1; i>= position; i--) {
            array[i+1] = array[i];
        }
        array[position] = item;
        return numofelements+1;
    }

}


