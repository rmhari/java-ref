package com.techatpark.corejava.arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArraySearchTest {

    @Test
    void test_search() {
        // Get the array
        int[] arr = {5, 1, 1, 9, 7, 2, 6, 10};
        //item to search
        int item = 6;

        //no of elements
        int n = 8;

        int result = ArraySearch.search(arr, n, item);
        assertEquals(6, result, "Element found");


    }

    @Test
    void test_check() {

        // Get the array
        int[] arr = {5, 1, 1, 9, 7, 2, 6, 10};
        //item to search
        int item = 6;
        int result = ArraySearch.check(arr, item);
        assertEquals(6, result, "Element found");
    }
}



