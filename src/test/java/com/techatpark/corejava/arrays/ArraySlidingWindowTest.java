/*
 * Copyright (c) Haripriya
 */

package com.techatpark.corejava.arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArraySlidingWindowTest {

    @Test
    void test_slidingWindow() {
        int[] array = {-8, 7, 4, 5, 20, 7, 1, 3};
        int window = 3;
        int op = 28;
        int n = array.length;
        int i = ArraySlidingWindow.slidingWindow(array, window, n, op);
        assertEquals(4, i);
    }

    @Test
    void test_noslidingWindow() {
        int[] array = {-8, 4, 20, 7, 13};
        int window = 3;
        int op = 28;
        int n = array.length;
        int i = ArraySlidingWindow.slidingWindow(array, window, n, op);
        assertEquals(-1, i);
    }
}