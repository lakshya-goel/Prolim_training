package com;

public class UPIPayment extends Payment {
    private String upiId;

    // Constructor using super() to initialize base class fields
    public UPIPayment(int paymentId, double amount, String upiId) {
        super(paymentId, amount);
        this.upiId = upiId;
    }

    // Overriding processPayment method
    @Override
    public void processPayment() {
        System.out.println("Processing UPI Payment...");
        System.out.println("Payment ID: " + paymentId);
        System.out.println("Amount: $" + amount);
        System.out.println("UPI ID: " + upiId);
        System.out.println("UPI Payment Successful.\n");
    }
}
