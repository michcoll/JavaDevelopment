package newLab21;

import java.util.*;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class CountriesTextFile {
	private ArrayList<String> countries = null;
	private Path countriesPath = null;
	private File countriesFile = null;

	public CountriesTextFile() {
		countriesPath = Paths.get("/home/michcoll/Dev/eclipse/Lab21/src/countries.txt");
		countriesFile = countriesPath.toFile();
		countries = this.getCountries();
	}

	public ArrayList<String> getCountries() {
		if (countries != null)
			return countries;

		countries = new ArrayList<>();


	
	
	if (Files.exists(countriesPath)) {
	
		try (BufferedReader in =  
				new BufferedReader(
				new FileReader(countriesFile)))
			{
			
				String line = in.readLine();
				while(line != null)	{
					countries.add(line);
					line = in.readLine();
				}
			}
		catch(IOException e) {
			
		}
	}
	return countries;	
				
	}
	

	public boolean saveCountries() {
		try (PrintWriter out = new PrintWriter(new BufferedWriter(
				new FileWriter(countriesFile)))) {
			for (String string : countries) {
				out.println(string);

			}
		} catch (IOException e) {
			return false;

		}
		return true;
	}
	
	public boolean addCountries(String s) {
		countries.add(s);
		return this.saveCountries();
	}
	
}