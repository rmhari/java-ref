package com.htheprogrammer.subclass;

public class Manager extends Member{

    String department;

    @Override
    public void display() {
        super.display();
        System.out.println(department);
    }

    public static void main(String[] args) {
        Manager m = new Manager();
        m.name = "hari";
        m.address = "singanallur";
        m.age = 32;
        m.phonenumber = "73687463";
        m.salary = 43563;
        m.department = "Network Engineer";
        m.display();
    }
}
