package com.htheprogrammer.methods;

public class BankC extends Bank {

    int amount;
    public BankC(final int amount) {
        this.amount = amount;
    }

    @Override
    public void getBalance() {
        System.out.println(amount);
    }

    public static void main(String[] args) {
        Bank b1 = new BankA(1000);
        Bank b2 = new BankB(1500);
        Bank b3 = new BankC(2000);
        b1.getBalance();
        b2.getBalance();
        b3.getBalance();

    }
}
