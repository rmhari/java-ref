package com.htheprogrammer.methods;

class Printnumber {
    public void printn(int number) {
        System.out.println(number);
    }
    public void printn(double number) {
        System.out.println(number);
    }
    public void printn(float number) {
        System.out.println(number);
    }
    public void printn(long number) {
        System.out.println(number);
    }

    public static void main(String[] args) {
        Printnumber p = new Printnumber();
        p.printn(5);
        p.printn(145.00/100);
        p.printn(7743.34);
        //p.printn(-9223372036854775808 );
    }
}
