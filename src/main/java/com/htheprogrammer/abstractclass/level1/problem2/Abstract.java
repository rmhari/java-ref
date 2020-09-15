package com.htheprogrammer.abstractclass.level1.problem2;

public class Abstract {

    public static void main(String[] args) {
        Bank b1 = new BankA(100);
        Bank b2 = new BankB(150);
        Bank b3 = new BankC(200);

        b1.getBalance();
        b2.getBalance();
        b3.getBalance();
    }
}
