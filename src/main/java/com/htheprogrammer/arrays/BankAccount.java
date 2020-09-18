package com.htheprogrammer.arrays;

import java.util.Scanner;

public class BankAccount {
   String nameofdepositor;
   String address;
   String accounttype;
   Integer balance;
   Integer accountnumber;
   String id;

    public String generateAccNumber() {
        long idCounter = 1001;
        String id = "B" + idCounter++;
        return id;
    }

    public BankAccount(String aNameofdepositor, String aAddress, String aAccounttype, Integer aBalance, String id) {
        this.nameofdepositor = aNameofdepositor;
        this.address = aAddress;
        this.accounttype = aAccounttype;
        this.balance = aBalance;
        this.id = id;
    }

    public void displayInfo() {
        System.out.println( "Name: " + nameofdepositor);
        System.out.println("Account Number: " + accountnumber);
        System.out.println("Address: " + address);
        System.out.println("Account Type: " + accounttype);
        System.out.println("Balance: " + balance);
    }
    public void deposit(Integer amount) {

        balance = balance + amount;
    }

    public void withdraw(Integer amount) {
        balance = balance - amount;
    }

    public void changeAddress(String newAddress) {
        address = newAddress;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter no of depositors: ");
        int no_of_depositors = s.nextInt();
        BankAccount[] ba = new BankAccount[no_of_depositors];
        for (int i = 0; i < no_of_depositors; i++) {
            System.out.println("name:" );
            String name = s.next();
            System.out.println("address");
            String address = s.next();
            System.out.println("account type");
            String acc_type = s.next();
            System.out.println("balance:");
            Integer balance = s.nextInt();
            String acc = ba[i].generateAccNumber();
            ba[i] = new BankAccount(name, address, acc_type, balance, acc);

        }
        for (int i = 0; i < no_of_depositors; i++) {
            ba[i].displayInfo();
        }

        System.out.println(ba[1].generateAccNumber());

    }
}
