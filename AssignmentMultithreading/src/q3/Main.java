package q3;

public class Main {

	public static void main(String[] args) {
		Account acc = new Account();
		System.out.println("Total balance: " + acc.getBalance());
		
		ATM atm1 = new ATM(acc, "abc", 500);
		ATM atm2 = new ATM(acc, "def", 500);
		ATM atm3 = new ATM(acc, "ghi", 500);
		
		atm1.start();
		atm2.start();
		atm3.start();
	}
}
