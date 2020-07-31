/*
 * Copyright (c) Haripriya
 */

package com.techatpark.corejava.oops.inheritance;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ChildTest {

    @Test
    void testChild() {
        Child c = new Child();
        c.print_we();
        c.print_car1();
        c.print_car2();
    }
}