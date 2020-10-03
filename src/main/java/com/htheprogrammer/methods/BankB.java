package com.htheprogrammer.methods;

public class BankB extends Bank {

    int amount;
    public BankB(final int amount) {
        this.amount = amount;
    }
    @Override
    public void getBalance() {
        System.out.println(amount);
    }
}
