package com;

public class PaymentTest {
    public static void main(String[] args) {
        // Creating objects for each payment type
        CreditCardPayment creditPayment = new CreditCardPayment(101, 2500.00, "1234567890123456", 123);
        DebitCardPayment debitPayment = new DebitCardPayment(102, 1500.50, "9876543210987654", 4567);
        UPIPayment upiPayment = new UPIPayment(103, 500.75, "user@upi");

        // Demonstrating method overriding
        creditPayment.processPayment();
        debitPayment.processPayment();
        upiPayment.processPayment();
    }
}
