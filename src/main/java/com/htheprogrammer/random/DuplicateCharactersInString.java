package com.htheprogrammer.random;

import java.util.HashMap;
import java.util.Set;

public class DuplicateCharactersInString {
    static void duplicate(String input) {
        HashMap<Character, Integer> charMap = new HashMap<>();
        char[] charFromString = input.toCharArray();

        for (char c :
                charFromString) {
            if (charMap.containsKey(c)) {
                charMap.put(c, charMap.get(c) + 1);
            } else {
                charMap.put(c, 1);
            }
        }

        Set<Character> string = charMap.keySet();
        System.out.println("Duplicate Characters In " + input);
        for (Character ch : string) {
            if (charMap.get(ch) > 1) {
                //If any char has a count of more than 1, printing it's count
                System.out.println(ch + " : " + charMap.get(ch));
            }
        }
    }

    public static void main(String[] args) {
        duplicate("haripriya");
        duplicate("chuifewjjfhhoffd");
    }
}
