package com.htheprogrammer.methods;

public class Undergraduate extends Degree {

    @Override
    public void getDegree() {
        System.out.println("I am an undergraduate.");
    }

    public static void main(String[] args) {
        Degree d = new Degree();
        d.getDegree();
        Undergraduate u = new Undergraduate();
        u.getDegree();
        PostGraduate p = new PostGraduate();
        p.getDegree();
        Degree d1 = new Undergraduate();
        d1.getDegree();
        Degree d2 = new PostGraduate();
        d2.getDegree();
    }
}
