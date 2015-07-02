import java.util.Scanner;
public class ValidatorTestApp {

	public static void main(String[] args) {
		int tryNum;
		
		System.out.println("Welcome to the Validation Tester Application\n");
		
		OOValidator.getInt("Int Test\n" + "Please enter an integer"
				+ " between -100 and 100");
		
		OOValidator.getIntWithinRange("Enter an integer", -100, 100);
		
		OOValidator.getDouble("Double Test\n" + "Please enter a double"
				+ " between -100 and 100");
		
		OOValidator.getDoubleWithinRange("Enter an integer", -100.0, 100.0);

	}

}
