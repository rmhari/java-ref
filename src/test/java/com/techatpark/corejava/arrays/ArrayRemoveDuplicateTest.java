/*
 * Copyright (c) Haripriya
 */

package com.techatpark.corejava.arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArrayRemoveDuplicateTest {

    @Test
    void test_removeDuplicate() {
        int[] array = {7,7,7,8,9,43,43,67,445,445};
        int numofelements = 10;
        int total = ArrayRemoveDuplicate.removeDuplicate(array, numofelements);
        assertEquals(6, total);
    }
}