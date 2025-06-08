package q4;

public class Teacher extends Thread{
	private SharedResource qa;
	private String[] answers;
	
	public Teacher(SharedResource qa, String[] answers) {
		this.qa = qa;
		this.answers = answers;
	}
	
	public void run() {
		for(String answer: answers) {
			qa.giveAnswer(answer);
		}
	}

}
