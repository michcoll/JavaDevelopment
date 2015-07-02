package newLab21;

import java.util.Scanner;


public class CountriesApp {

	public static void main(String[] args) {
		CountriesTextFile newCountries = new CountriesTextFile();
		
		Scanner newScanner = new Scanner(System.in);
		
		System.out.println("Option 1: display current countries");
		System.out.println("Option 2: enter a country");
		System.out.println("Option 3: exit program");
		
		int userInput = newScanner.nextInt();
		newScanner.nextLine();
		switch(userInput) {
		case 1: 
			//for (int i = 0; i < newCountries.getCountries().size(); i++)
			for (String string : newCountries.getCountries()) {				
				System.out.println(string);			
			}
			break;
			
		case 2:
			String stringInput = newScanner.nextLine();
			newCountries.addCountries(stringInput);
			break;
			
		case 3: 
			System.out.println("Good bye!");
			System.exit(0);
			
		default : 
			System.out.println("");
			
		}	


	}

}