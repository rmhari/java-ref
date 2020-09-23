package com.htheprogrammer.methods;

public class BankA extends Bank {
int amount;
    public BankA(final int amount) {
        this.amount = amount;
    }

    @Override
    public void getBalance() {
        System.out.println(amount);
    }
}
