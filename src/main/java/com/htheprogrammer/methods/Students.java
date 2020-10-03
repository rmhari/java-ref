package com.htheprogrammer.methods;

public class Students {
    String name;
    int age;
    String address;

    public Students(final String name, final int age, final String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public void setInfo(String name, int age) {
        this.name = name;
        this.age = age;

    }
    public void setInfo(String name, int age, String address) {
        setInfo(name, age);
        this.address = address;
    }

    public boolean print() {
        System.out.println(name+" " + age+" " + address);
        return false;
    }

    public static void main(String[] args) {
        Students[] students = new Students[3];

        for (int i = 0; i < 3; i++) {
            students[i] = new Students("Unknown", 0, "Not Available");
        }
        students[0].setInfo("hari", 32);
        students[1].setInfo("priya", 32, "mnm");

        for (int i = 0; i < 3; i++) {
            students[i].print();
        }
//        students.setInfo("hari", 32);
//        students.setInfo("Priya", 32, "manamadurai");
//        System.out.println(students.name + students.address + students.age);
    }
}
