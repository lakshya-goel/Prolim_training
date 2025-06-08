package com;

import java.util.ArrayList;

public class AccountManager {
	private ArrayList<Account> accounts;
	
	public AccountManager() {
		accounts = new ArrayList<>();
	}
	
	public void addAccount(Account account) {
		accounts.add(account);
	}
	
	public Account findAccount(String accNumber) {
		for(Account acc: accounts) {
			if(acc.getAccountNumber().equals(accNumber)) {
				return acc;
			}
		}
		return null;
	}
	
	public void displayAllAccounts() {
		for(Account acc: accounts) {
			acc.displayDetails();
			System.out.println("---------------------");
		}
	}

}
