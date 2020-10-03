//if we have the method as static, it means it is class method, it can be called without an instance of class.
//if the method is not static , an instance or object for the class s needed to call the method.

package com.htheprogrammer.stringreverse;

import java.util.Stack;

public class StackandStringBuilder {

    public static void main(String[] args) {

        String str = "haripriya";
        str = reverse(str);
        System.out.println(str);
    }

    public static String reverse(String str) {

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            stack.push(str.charAt(i));
        }

        StringBuilder sb = new StringBuilder();
        while (!stack.isEmpty())
            sb.append(stack.pop());

        // convert StringBuilder to String and return
        return sb.toString();
    }
}
