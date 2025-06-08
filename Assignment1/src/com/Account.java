package com;

public class Account extends BankAccount implements Transaction {
    private double balance;
    public static int accountCount = 0;
    public static final String BANK_NAME = "ABC Bank";

    public Account(String accountNumber, String accountHolderName, double balance) {
        super(accountNumber, accountHolderName);
        this.balance = balance;
        accountCount++;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount);
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient funds.");
        }
    }

    @Override
    public double calculateInterest() {
        return balance * 0.03; // 3% interest
    }

    public static int getAccountCount() {
        return accountCount;
    }

    public final String getBankName() {
        return BANK_NAME;
    }

    public void displayDetails() {
        System.out.println("Account Number: " + getAccountNumber());
        System.out.println("Holder Name: " + getAccountHolderName());
        System.out.println("Balance: " + balance);
    }
}
