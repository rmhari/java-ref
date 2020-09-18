package com.htheprogrammer.subclass;

public class Subclass extends ParentClass {
    public void methodSubClass() {
        System.out.println("this is child class");
    }

    public static void main(String[] args) {
        ParentClass parentClass = new ParentClass();
        parentClass.method1();

        Subclass subClass = new Subclass();
        subClass.methodSubClass();

        ParentClass child = new Subclass();
        child.method1();


    }
}
