/*
 * Copyright (c) Haripriya
 */

package com.techatpark.corejava.arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArraySortCheckTest {

    @Test
    void test_isSorted() {
        int[] array = {7,8,9,43,67,445};
        int numofelements = 6;
        boolean yes = ArraySortCheck.isSorted(array, numofelements);
        assertTrue(yes);
    }
}