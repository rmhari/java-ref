//without uilt in method = removeAll.
package com.htheprogrammer.random;

import java.util.Scanner;

public class RemovingWhiteSpaces2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String stringtoremove = s.nextLine();
        String output = "";
        char[] stringAsArray = stringtoremove.toCharArray();
        for (int i = 0; i < stringAsArray.length; i++) {
            if ((stringAsArray[i] != ' ') && (stringAsArray[i] != '\t')) {
                output = output + stringAsArray[i];
            }
        }
        System.out.println(stringtoremove);
        System.out.println(output);
    }
}
