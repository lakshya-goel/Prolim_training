package q4;

public class Main {
	public static void main(String[] args) {
		SharedResource qa = new SharedResource();
		
		String[] questions = {
			"What is polymorphism?",
			"Explain inheritance.",
			"What is an interface in Java?"
		};
		
		String[] answers = {
            "Polymorphism allows methods to behave differently based on object.",
            "Inheritance allows a class to acquire properties of another.",
            "An interface is a contract with abstract methods only."
        };
		
		
		Student s = new Student(qa, questions);
		Teacher t = new Teacher(qa, answers);
		
		t.start();
		s.start();
	}
}
