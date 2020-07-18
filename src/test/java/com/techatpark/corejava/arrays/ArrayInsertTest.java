/*
 * Copyright (c) Haripriya
 */

package com.techatpark.corejava.arrays;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class ArrayInsertTest {


    @Test
    void test_insert() {
        // Get the array
        int[] array = new int[10];
        array[0] = 5;
        array[1] = 1;
        array[2] = 1;
        array[3] = 9;
        array[4] = 7;
        array[5] = 2;
        array[6] = 6;
        array[7] = 10;
        //no.on elements
        int numofelements = 8;
        //capacity of array
        int capacityofarray = 10;
        //index tot insert
        int position = 4;
        //item to insert
        int item = 45;

        ArrayInsert.insert(array, numofelements, capacityofarray, position, item);
        assertEquals(7, array[5]);

    }

}