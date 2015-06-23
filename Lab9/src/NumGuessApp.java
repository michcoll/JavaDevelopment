import java.util.Scanner;

public class NumGuessApp {

	public static void main(String[] args) {
		Scanner newScanner = new Scanner(System.in);
		String continueOrNot = "y";
		
		while (continueOrNot.equalsIgnoreCase("y")) {
		int countGuesses = 0;
		
		
		

		int randomNum = (int) (Math.random() * 100 + 1);
		

		int tryNum;		
		String rating = "";
				
		do {
			countGuesses++;			
			tryNum = NumGuess.getIntWithinRange(newScanner,
					"Enter a prompt between 1 and 100", 1, 100);
			if (tryNum > (randomNum + 10)) {
				System.out.println("Way too high");
			} else if (tryNum < (randomNum - 10)) {
				System.out.println("Way too low");
			} else if (tryNum > randomNum) {
				System.out.println("Too high");
			} else if (tryNum < randomNum) {
				System.out.println("Too low");
			}
		} while (tryNum != randomNum);
		
		if (countGuesses < 10) {
			rating = "A";
			System.out.println("Thank you for playing - you are amazing!");
		}else {
			rating = "B";
			System.out.println("Thank you for playing - keep up the good work.");
		}
		
		System.out.printf("Congratulations, you took %s guesses and have a score of %s\n", countGuesses, rating);
		
		}

	}

}
