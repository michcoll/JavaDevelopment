import java.util.ArrayList;
import java.util.Scanner;

//import java.util.HashMap;
//import java.util.Map;

public class MovieApp {
	public static void main(String args[]) {
		System.out.println("Welcome to the Movie List Application\n");
		System.out.println("There are 100 movies in the list.");

		Scanner sc = new Scanner(System.in);
		String choice = "y";
		ArrayList<Movie> movies = new ArrayList<Movie>();
		for (int i = 1; i <= 100; i++)
			movies.add(MovieIO.getMovie(i));

		while (choice.equalsIgnoreCase("y")) {
			System.out.println("What category are you interested in - "
					+ "(animated, drama, horror, scifi)? ");

			String category = sc.next();
			System.out.println(category);

			for (Movie movie : movies) {

				if (category.equalsIgnoreCase(movie.category)) {
					System.out.println(movie.title);
				}
			}

			System.out.println("Continue? (y/n): ");
			choice = sc.next();
		}
		System.out.println("Thank you!");
	}
}
