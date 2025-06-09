package com;

public class Payment {
    protected int paymentId;
    protected double amount;

    // Constructor
    public Payment(int paymentId, double amount) {
        this.paymentId = paymentId;
        this.amount = amount;
    }

    // Method to be overridden
    public void processPayment() {
        System.out.println("Processing Payment...");
    }
}

