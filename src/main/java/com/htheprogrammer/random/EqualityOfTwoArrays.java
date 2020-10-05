//check equality in three diff ways, 1) without builtin method,
// 2) Arrays.equals(), 3) Arrays.deepEquals().

package com.htheprogrammer.random;

import java.util.Arrays;

public class EqualityOfTwoArrays {

    static void iterativemethod() {
        int[] arrayOne = {2, 5, 1, 7, 4};
        int[] arrayTwo = {2, 5, 1, 9, 4};
        boolean equalOrNot = true;
        if (arrayOne.length == arrayTwo.length) {
            for (int i = 0; i < arrayOne.length; i++) {
                if (arrayOne[i] != arrayTwo[i]) {
                    equalOrNot = false;
                }
            }
        } else {
            equalOrNot = false;
        }
        if (equalOrNot) {
            System.out.println("Two Arrays Are Equal");
        } else {
            System.out.println("Two Arrays Are Not equal");
        }
    }

    static void arraysEqualMethod() {
        String[] s1 = {"java", "j2ee", "struts", "hibernate"};
        String[] s2 = {"jsp", "spring", "jdbc", "hibernate"};
        String[] s3 = {"java", "j2ee", "struts", "hibernate"};
        //needed if the arrays are not iin order
        Arrays.sort(s1);
        Arrays.sort(s2);
        System.out.println(Arrays.equals(s1, s2));
        System.out.println(Arrays.equals(s1, s3));
    }

    static void arraysDeepEquals() {
        String[][] s1 = { {"java", "swings", "j2ee" }, { "struts", "jsp", "hibernate"} };
        String[][] s2 = { {"java", "swings", "j2ee" }, { "struts", "jsp", "hibernate"} };
        System.out.println(Arrays.deepEquals(s1, s2));     //Output : true
        //Calling equals() method on same arrays will return false
        System.out.println(Arrays.equals(s1, s2));        //Output : false
        //That's why use deepEquals() method to compare multidimensional arrays
    }


    public static void main(String[] args) {
        iterativemethod();
        arraysEqualMethod();
        arraysDeepEquals();
    }
}
