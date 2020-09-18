package com.hackkerank.pancakeprbm;

import java.util.Arrays;
import java.util.Scanner;

public class Solution {

    static boolean isAnagram(String a, String b) {
        // Complete the function

        int n1 = a.length();
        int n2 = b.length();
        if (n1 != n2) {
            return false;
        }
        char[] tempArray1 = a.toCharArray();
        char[] tempArray2 = b.toCharArray();
        Arrays.sort(tempArray1);
        Arrays.sort(tempArray2);
        for(int i = 0; i<n1; i++) {
            if (tempArray1[i] != tempArray2[i]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}