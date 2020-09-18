//Write a program to print the name, salary and date of joining of 10 employees in a company.
// Use array of objects.

package com.htheprogrammer.arrays;

import java.util.Scanner;

public class Employee {
    String name;
    Integer salary;
    Integer date;

    public void getInput() {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter employee name");
        name = s.next();
        System.out.println("Enter the salary");
        salary = s.nextInt();
        System.out.println("Enter date of joining");
        date = s.nextInt();
    }

    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
        System.out.println("Date: " + date);
    }

    public static void main(String[] args) {
        Employee[] emp = new Employee[3];

        for (int i = 0; i <= 2; i++) {
            emp[i] = new Employee();
            emp[i].getInput();
        }

        for (int i = 0; i <= 2; i++) {
            emp[i].display();
        }
    }
}
