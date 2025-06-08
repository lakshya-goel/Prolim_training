package q3;

public class ATM extends Thread{
	private String atmName;
	private int amt;
	private Account account;
	
	public ATM(Account acc, String name, int amt) {
		this.account = acc;
		this.atmName = name;
		this.amt = amt;
	}
	
	public void run() {
		account.withdraw(amt, atmName);
	}
}
