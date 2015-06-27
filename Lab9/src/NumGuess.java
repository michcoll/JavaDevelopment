import java.util.Scanner;

public class NumGuess {

	public static int getIntWithinRange(Scanner sc, String prompt, int min,
			int max) {
		boolean check = false;

		System.out.println(prompt);

		int newNum = 0;

		while (check == false) {
			check = sc.hasNextInt();
			if (check) {
				newNum = sc.nextInt();
				if (newNum < min || newNum > max) {
					check = false;
					System.out.println("Please enter a number from 1 to 100");
				}
			} else {
				System.out.println("Please enter a number from 1 to 100");
				
			}
			sc.nextLine();
		}

		return newNum;
	}

	public static String getString(Scanner sc, String prompt) {
		String answer = "";
		System.out.println(prompt);
		while (true) {
			answer = sc.nextLine();
			if (answer.equalsIgnoreCase("y") || answer.equalsIgnoreCase("n"))
				return answer;
			else
				System.out.println("Error:  Please enter y or n");
		}

	}
	

}
