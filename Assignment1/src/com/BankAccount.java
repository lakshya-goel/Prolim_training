package com;


public abstract class BankAccount {
	private String accountNumber;
	private String accountHolderName;
	
	public BankAccount(String accountNumber2, String accountHolderName2) {
		this.accountNumber = accountNumber2;
        this.accountHolderName = accountHolderName2;
	}

	public abstract double calculateInterest();

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getAccountHolderName() {
		return accountHolderName;
	}

	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}
}
