package com.htheprogrammer.abstractclass.level1.problem2;

public class BankB extends Bank {
    private Integer balance;

    public BankB(int aBalance){
        balance = aBalance;
    }

    @Override
    void getBalance() {
        System.out.println("Bank-B balance: " + balance);
    }
}
