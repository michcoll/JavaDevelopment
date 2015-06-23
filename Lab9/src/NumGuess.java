import java.util.Scanner;


public class NumGuess {
	
	public static int getIntWithinRange(Scanner sc, String prompt, int min, int max) {
		boolean check = false;		
		
		System.out.println(prompt);
		
		int newNum = 0;
		
		while(check == false) {
			check = sc.hasNextInt();
			if (check) {
				newNum = sc.nextInt();				
				if (newNum < min || newNum > max){
					check = false;
					System.out.println("Please enter a number from 1 to 100");
				} 
			} else {
				System.out.println("Please enter a number from 1 to 100");
			}
			
		}
		
		return newNum;
	}
	
	
	
}
