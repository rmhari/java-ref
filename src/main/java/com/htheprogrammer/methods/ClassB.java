package com.htheprogrammer.methods;

public class ClassB extends ClassA {
int j;
    @Override
    public void printNum() {
        System.out.println(j);
    }

    public static void main(String[] args) {
        ClassA classA = new ClassA();
        ClassB classB = new ClassB();
        classB.i = 5;
        classB.j = 7;
        classB.printNum();
        classB.j = classB.i;
        classA.i = 4;
        classA.printNum();
        classB.printNum();

    }
}
