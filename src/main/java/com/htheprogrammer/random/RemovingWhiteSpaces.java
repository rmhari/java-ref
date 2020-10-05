package com.htheprogrammer.random;

import java.util.Scanner;

public class RemovingWhiteSpaces {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        String stringwithspace = s.nextLine();
        String withoutspace = stringwithspace.replaceAll("\\s", "");
        System.out.println(withoutspace);
    }

}
