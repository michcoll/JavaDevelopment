import java.util.Scanner;

public class Powers {

	long userInput;

	public void start() {
		System.out.println("Learn your squares and cubes!");

		Scanner takeUserInput = new Scanner(System.in);
		String continueOrNot = "y";
		while (continueOrNot.equalsIgnoreCase("y")) {
			userInput = PowersValidator.getInt(takeUserInput,
					"Enter an integer: ");
			
			System.out.println("\nNumber\t Squared Cubed");
			System.out.println("======\t ======\t ======");

			long beginCount = 1;
			while (beginCount < userInput + 1) {
				System.out.println(beginCount + "\t"
						+ (beginCount * beginCount) + "\t"
						+ (beginCount * beginCount * beginCount));
				beginCount++;			
			}
			
			continueOrNot = PowersValidator.getUserContinueResponse(takeUserInput, "Continue y/n: ");
			System.out.println();
		}
	}
}