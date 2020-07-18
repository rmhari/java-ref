/*
 * Copyright (c) Haripriya
 */

package com.techatpark.corejava.arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArrayReverseTest {

    @Test
    void test_reverse() {
        int[] array = {7,8,9,43,67,445};
        int numofelements = 6;
        ArrayReverse.reverse(array, numofelements);
        assertEquals(7, array[5]);
    }
}