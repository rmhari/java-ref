package com.htheprogrammer.stringreverse;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionFramework {

public static String reverse(String str) {
    List<Character> list = new ArrayList<>();

    for (char c: str.toCharArray()) {
        list.add(c);
    }

    Collections.reverse(list);

    // covert ArrayList into String using StringBuilder and return it
    StringBuilder builder = new StringBuilder(list.size());
    for (Character c : list)
        builder.append(c);

    return builder.toString();
}

    public static void main(String[] args) {
        String str = "haripriya";
        str = reverse(str);
        System.out.println(str);
    }
}
