package com.hackkerank.pancakeprbm;

public class Float {
    float f;

    public Float(float f) {
        this.f = f;
    }

    public static void main(String[] args) {
        try {
            java.lang.Float f1 = new java.lang.Float(3.0);
            int x = f1.intValue();
            byte b = f1.byteValue();
            double d = f1.doubleValue();
            System.out.println( x + b + d);
        }
        catch (NumberFormatException e) {
            System.out.println("bad number");
        }
    }
}
