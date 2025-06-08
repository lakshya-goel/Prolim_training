package multithreading;

import java.text.SimpleDateFormat;
import java.util.Calendar;

class Clock implements Runnable{
	private SimpleDateFormat timeFormat;
	
	Clock(){
		this.timeFormat = new SimpleDateFormat("HH:mm:ss");
	}
	
	@Override
	public void run() {
		while(true) {
			Calendar calendar = Calendar.getInstance();
			String currentTime = timeFormat.format(calendar.getTime());
			System.out.println("Time: " + currentTime);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
				break;
			}
		}
	}
}

public class Q2 {
	public static void main(String[] args) {
		Clock clock = new Clock();
		Thread clockThread = new Thread(clock);
		clockThread.start();
	}

}
