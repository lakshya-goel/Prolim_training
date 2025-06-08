package multithreading;

class Even implements Runnable{
	@Override
	public void run() {
		for(int i=0;i<50;i+=2) {
			System.out.println(i);
		}
	}
	
}

class Odd implements Runnable{
	@Override
	public void run() {
		for(int j=1; j<50; j+=2) {
			System.out.println(j);
		}
	}
}
public class Q1 {

	public static void main(String[] args) {
		Runnable A = new Even();
		Runnable B = new Odd();
		Thread t1 = new Thread(A);
		Thread t2 = new Thread(B);
		t1.start();
		t2.start();

	}

}
