package com.htheprogrammer.stringreverse;

public class UsingStringBuilder {

    public static void main(String[] args) {
        String str = "Haripriya";

        String r = reverse(str);

        System.out.println(r);
    }

    public static String reverse(String str) {
        StringBuilder sb = new StringBuilder(str);
        String reverse = sb.reverse().toString();
        return reverse;
    }

}
