//Write a program by creating an 'Employee' class having the following methods and print the final salary.
//1 - 'getInfo()' which takes the salary, number of hours of work per day of employee as parameter
//2 - 'AddSal()' which adds $10 to salary of the employee if it is less than $500.
//3 - 'AddWork()' which adds $5 to salary of employee if the number of hours of work per day is more than 6 hours.

package com.htheprogrammer.classesandobjects.level2;

class Employee {

    Double salary;
    Integer noOfHours;

    public void getInfo(double aSalary, Integer aNoOfHours) {
        salary = aSalary;
        noOfHours = aNoOfHours;
    }

    public Double addSal() {
        double addSalary = salary;
        if ( salary < 500) {
            addSalary = salary + 10;
        }
        return addSalary;
    }

    public Double addWork(Double addSalary) {
        if ( noOfHours > 6) {
            addSalary += 5;
        }
        return addSalary;
    }

    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.getInfo(400, 7);
        //System.out.println("Salary " + employee.addSal());
        System.out.println("Salary " + employee.addWork(employee.addSal()));
    }

}
