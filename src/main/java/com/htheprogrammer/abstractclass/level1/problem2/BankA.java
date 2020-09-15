package com.htheprogrammer.abstractclass.level1.problem2;

public class BankA extends Bank {
    private Integer balance;

    public BankA(int aBalance){
        balance = aBalance;
    }

    @Override
    void getBalance() {
        System.out.println("Bank-A balance: " + balance);
    }
}
