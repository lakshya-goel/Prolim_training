package q3;

public class Account {
	private int balance = 1000;
	
	public synchronized boolean withdraw(int amt, String atmName) {
		System.out.println("ATM :" + atmName + " is attempting to withdraw: " + amt);
		if(amt <= balance) {
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			balance -= amt;
			System.out.println("Transaction for ATM: " + atmName + " completed. Remaining balance: "+ balance);
			return true;
		}
		else {
			System.out.println(atmName + " failed to withdraw due to insufficent balance.");
			return false;
		}
	}
	
	public int getBalance() {
		return balance;
	}
}
