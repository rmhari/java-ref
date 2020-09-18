package com.htheprogrammer.subclass;

public class Employee extends Member{

    String specialization;

    @Override
    public void display() {
        super.display();
        System.out.println(specialization);
    }

    public static void main(String[] args) {
        Employee m = new Employee();
        m.name = "hari";
        m.address = "singanallur";
        m.age = 32;
        m.phonenumber = "73687463";
        m.salary = 43563;
        m.specialization = "data engineer";
        m.display();
    }
}
