import java.util.Scanner;

public class PowersValidator {
	
	public static int getInt (Scanner takeUserInput, String prompt) {
		int i = 0;
		boolean isValid = false;
		while (isValid == false) {
			System.out.print(prompt);
			if (takeUserInput.hasNextInt()) {
				i = takeUserInput.nextInt();
				isValid = true;
			}
			else {
				System.out.println("Try again. Please enter a valid integer.");
			}
			takeUserInput.nextLine(); 
		}
		
		return i;
	}
	
	public static String getUserContinueResponse(Scanner newScanner, String prompt) {
		System.out.println(prompt);
		String continueOrNot = newScanner.next();
		return continueOrNot;		
	}
}
