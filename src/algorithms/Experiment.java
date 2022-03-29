package algorithms;

import java.util.Scanner;

public class Experiment {
	
	public static void main(String[] args) {
		Experiment experiment = new Experiment();
		experiment.prompt();
	}
	
	private void prompt() {
		
		System.out.print("What is your score? ");
		Scanner scanner = null;
		Integer score = -1;
		try {
			scanner = new Scanner(System.in);
			score = scanner.nextInt();
		} catch (Exception e) {
			System.out.println("Invalid score");
			prompt();
			return;
		} finally {
			scanner.close();
		}
		System.out.println("Your grade is " + evaluateGrade(score));
	}

	private char evaluateGrade(Integer score) {
		
		if(score > 70)
			return 'A';
		if(score > 60)
			return 'B';
		else
			return 'F';
	}
}
