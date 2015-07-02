import java.util.Scanner;

public class OOValidator {

	public OOValidator(Scanner sc) {
		Scanner newScanner = new Scanner(System.in);
		int news = newScanner.nextInt();

	}

	public static int getInt(String prompt) {
		System.out.println(prompt);
		return 0;
	}
	
	
	

	public static int getIntWithinRange(String prompt, int min, int max) {
		{
			boolean isValid = false;
			String userString = "";
			char userChar;
			
			while (isValid == false) {				
				
				Scanner newScanner = new Scanner(System.in);
				int userInput = newScanner.nextInt();

				if (userInput >= -100 && userInput <= 100) {
					isValid = true;					
				}else if (userInput < -100) {
					System.out.println("Error! Number must be greater than -101");
				} else if (userInput > 100) {
					System.out.println("Error! Number must be less than 101");
				} else {					
					System.out.println("try again");
					//TODO put this code in a try catch block
				}
				
			}
		}
		return 0;
	}

	public static double getDouble(String prompt) {
		System.out.println(prompt);
		return 0.0;
	}

	public static double getDoubleWithinRange(String prompt, double min, double max) {
		boolean isValid = false;	
		
		while (isValid == false) {				
			
			Scanner newScanner = new Scanner(System.in);
			double userInput = newScanner.nextDouble();

			if (userInput >= -100 && userInput <= 100) {
				isValid = true;					
			}else if (userInput < -100) {
				System.out.println("Error! Number must be greater than -101");
			} else if (userInput > 100) {
				System.out.println("Error! Number must be less than 101");
			} else {					
				System.out.println("try again");
				//TODO put this code in a try catch block
			}
		
	}
		return 0.0;
	}
}
