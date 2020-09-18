package com.htheprogrammer.subclass;

public class Member {

    String name;
    Integer age;
    String phonenumber;
    String address;
    Integer salary;

    public void printSalary() {
        System.out.println(salary);
    }
    
    public void display() {
        System.out.println(name +","+ age +","+ phonenumber +","+ address +","+ salary);
    }
}
