package com;

public class DebitCardPayment extends Payment {
    private String cardNumber;
    private int pin;

    // Constructor using super() to initialize base class fields
    public DebitCardPayment(int paymentId, double amount, String cardNumber, int pin) {
        super(paymentId, amount);
        this.cardNumber = cardNumber;
        this.pin = pin;
    }

    // Overriding processPayment method
    @Override
    public void processPayment() {
        System.out.println("Processing Debit Card Payment...");
        System.out.println("Payment ID: " + paymentId);
        System.out.println("Amount: $" + amount);
        // Mask card number: show only last 4 digits
        String maskedCard = "**** **** **** " + cardNumber.substring(cardNumber.length() - 4);
        System.out.println("Card Number: " + maskedCard);
        System.out.println("Debit Card Payment Successful.\n");
    }
}
