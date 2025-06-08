package com;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        AccountManager accountManager = new AccountManager();
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n1. Add Account");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Display Account Details");
            System.out.println("5. Calculate Interest");
            System.out.println("6. Get Account Count");
            System.out.println("7. Get Balance");
            System.out.println("0. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter account number: ");
                    String accNo = sc.next();
                    System.out.print("Enter account holder name: ");
                    sc.nextLine(); // consume newline
                    String name = sc.nextLine();
                    System.out.print("Enter initial balance: ");
                    double bal = sc.nextDouble();
                    accountManager.addAccount(new Account(accNo, name, bal));
                    break;
                case 2:
                    System.out.print("Enter account number: ");
                    accNo = sc.next();
                    Account acc2 = accountManager.findAccount(accNo);
                    if (acc2 != null) {
                        System.out.print("Enter amount to deposit: ");
                        double amt = sc.nextDouble();
                        acc2.deposit(amt);
                    } else {
                        System.out.println("Account not found.");
                    }
                    break;
                case 3:
                    System.out.print("Enter account number: ");
                    accNo = sc.next();
                    Account acc3 = accountManager.findAccount(accNo);
                    if (acc3 != null) {
                        System.out.print("Enter amount to withdraw: ");
                        double amt = sc.nextDouble();
                        acc3.withdraw(amt);
                    } else {
                        System.out.println("Account not found.");
                    }
                    break;
                case 4:
                    accountManager.displayAllAccounts();
                    break;
                case 5:
                    System.out.print("Enter account number: ");
                    accNo = sc.next();
                    Account acc5 = accountManager.findAccount(accNo);
                    if (acc5 != null) {
                        System.out.println("Interest: " + acc5.calculateInterest());
                    } else {
                        System.out.println("Account not found.");
                    }
                    break;
                case 6:
                    System.out.println("Total accounts: " + Account.getAccountCount());
                    break;
                case 7:
                    System.out.print("Enter account number: ");
                    accNo = sc.next();
                    Account acc7 = accountManager.findAccount(accNo);
                    if (acc7 != null) {
                        System.out.println("Balance: " + acc7.getBalance());
                    } else {
                        System.out.println("Account not found.");
                    }
                    break;
                case 0:
                    System.out.println("Exiting.");
                    break;
                default:
                    System.out.println("Invalid choice.");
            }

        } while (choice != 0);

        sc.close();
    }
}
