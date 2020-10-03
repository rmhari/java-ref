package com.htheprogrammer.methods;

class IntegerCharacter {
    public void print(int n ,char c) {
        System.out.println(n +","+ c);
    }
    public void print(char c, int n) {
        System.out.println(c +","+ n);
    }

    public static void main(String[] args) {
        IntegerCharacter ic = new IntegerCharacter();
        ic.print(5, 'a');
        ic.print('a', 5);

    }
}
