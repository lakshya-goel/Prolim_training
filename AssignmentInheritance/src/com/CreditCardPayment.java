package com;

public class CreditCardPayment extends Payment {
    private String cardNumber;
    private int cvv;

    // Constructor using super() to initialize base class fields
    public CreditCardPayment(int paymentId, double amount, String cardNumber, int cvv) {
        super(paymentId, amount);
        this.cardNumber = cardNumber;
        this.cvv = cvv;
    }

    // Overriding processPayment method
    @Override
    public void processPayment() {
        System.out.println("Processing Credit Card Payment...");
        System.out.println("Payment ID: " + paymentId);
        System.out.println("Amount: $" + amount);
        // Mask card number: show only last 4 digits
        String maskedCard = "**** **** **** " + cardNumber.substring(cardNumber.length() - 4);
        System.out.println("Card Number: " + maskedCard);
        System.out.println("Credit Card Payment Successful.\n");
    }
}
