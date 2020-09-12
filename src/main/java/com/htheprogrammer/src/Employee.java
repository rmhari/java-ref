package com.htheprogrammer.src;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Employee {

    int year;
    String name, adr;

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    void input() throws IOException {

        System.out.println("Enter your year of joining");
        year = Integer.parseInt(br.readLine());
        System.out.println("Enter your Name");
        name = br.readLine();
        System.out.println("Enter your addresses");
        adr = br.readLine();
    }

    public static void main(String[] args) throws IOException {
        Employee employee = new Employee();
        employee.input();
    }

}
