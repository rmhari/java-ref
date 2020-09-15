package com.htheprogrammer.abstractclass.level1.problem2;

public class BankC extends Bank{

    private Integer balance;

    public BankC(int aBalance){
        balance = aBalance;
    }

    @Override
    void getBalance() {
        System.out.println("Bank-C balance: " + balance);
    }
}
