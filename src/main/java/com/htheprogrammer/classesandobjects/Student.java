//problem 1 , 2
package com.htheprogrammer.classesandobjects;
class Student {

    String name;
    Integer roll_no;
    String phone_number;
    String address;

    public Student(String studentName, Integer studentRoll_no, String studentPhone_number, String studentAddress) {
        name = studentName;
        roll_no = studentRoll_no;
        phone_number = studentPhone_number;
        address = studentAddress;
    }

    public static void main(String[] args) {
        Student student1 = new Student("John", 2, "969874", "manamadurai");

        Student student2 = new Student("Sam", 1, "84679", "madurai");
        System.out.println(student1);
        System.out.println(student1.name + "," + student1.roll_no + "," + student1.phone_number + "," + student1.address);
        System.out.println(student2.name + "," + student2.roll_no + "," + student2.phone_number + "," + student2.address);

    }
}
