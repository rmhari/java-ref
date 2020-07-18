
package com.techatpark.corejava.arrays;

public class ArrayRemoveDuplicate {
    public static int removeDuplicate(int[] array, int numofelements) {

    int[] temp = new int[numofelements];
    int j = 0;
        for (int i = 0; i < numofelements-1; i++) {
            if (array[i] != array[i + 1]) {
                array[j++] = array[i];
            }
            array[j++] = array[numofelements - 1];

        } return j;
    }
}
