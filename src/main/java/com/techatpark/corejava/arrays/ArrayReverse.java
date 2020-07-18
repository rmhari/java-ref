
package com.techatpark.corejava.arrays;

public class ArrayReverse {

    public static int[] reverse(int[] array, int numofelements) {
        int lowelement = 0, highelement = numofelements-1;
        while(lowelement<highelement) {
           int temp = array[lowelement];
           array[lowelement] = array[highelement];
           array[highelement] = temp;
           lowelement++;
           highelement--;
        } return array;
    }
}
