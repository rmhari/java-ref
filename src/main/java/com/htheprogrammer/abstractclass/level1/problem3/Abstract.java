package com.htheprogrammer.abstractclass.level1.problem3;

public class Abstract {

    public static void main(String[] args) {
        Marks m1 = new ClassA(80,90,95);
        Marks m2 = new ClassB(80,82,90,95);
        m1.getPercentage();
        m2.getPercentage();
    }
}
