package com.htheprogrammer.src;//Print the average of three numbers entered by user by creating a class
// named 'Average' having a method to calculate and print the average

import java.util.Scanner;

class Average {

    Integer number1;
    Integer number2;
    Integer number3;

    public Average(Integer aNumber1, Integer aNumber2, Integer aNumber3) {
        number1 = aNumber1;
        number2 = aNumber2;
        number3 = aNumber3;
    }

    public Integer getAverage() {
        Integer result = (number1 + number2 + number3) / 3;
        return result;
    }

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int n1, n2, n3;

        System.out.println("number 1: ");
        n1 = s.nextInt();
        System.out.println("number 2: ");
        n2 = s.nextInt();
        System.out.println("number 3: ");
        n3 = s.nextInt();

        Average avg = new Average(n1, n2, n3);
        System.out.println(avg.getAverage());
    }


}
