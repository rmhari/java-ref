package com.htheprogrammer.methods;

public class B extends A {

    static void print() {
        System.out.println("child");
    }

    public static void main(String[] args) {
        B b = new B();
        A a = new A();
        b.print();
        a.print();
        A obj = new B();
        obj.print();
    }
}
