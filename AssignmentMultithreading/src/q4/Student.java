package q4;

public class Student extends Thread{
	private SharedResource qa;
	private String[] questions;
	
	public Student(SharedResource qa, String[] questions) {
		this.qa = qa;
		this.questions = questions;
	}
	
	public void run() {
		
		for (String question: questions) {
			qa.askQuestion(question);
		}
	}
}
