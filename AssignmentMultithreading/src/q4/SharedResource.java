package q4;

public class SharedResource {
	private boolean questionAsked = false;
	
	public synchronized void askQuestion(String question) {
		while(questionAsked) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("Student: "+ question);
		questionAsked = true;
		notify();
	}
	
	public synchronized void giveAnswer(String answer) {
		while(!questionAsked) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("Teacher: "+ answer);
		questionAsked = false;
		notify();
	}
}
