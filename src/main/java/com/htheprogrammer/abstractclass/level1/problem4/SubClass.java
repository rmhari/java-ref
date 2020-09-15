package com.htheprogrammer.abstractclass.level1.problem4;

import com.htheprogrammer.abstractclass.level1.problem1.Subclass1;

public class SubClass extends AbstractClass{
    @Override
    void a_method() {
        System.out.println("This is abstract method");
    }

    public static void main(String[] args) {
        SubClass subclass = new SubClass();
        subclass.a_method();
        subclass.non_abstract_method();

    }
}
