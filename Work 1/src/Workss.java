import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Workss {
	
	private static final String VALID_CREDENTIALS_REGEX = "[0-9]{1,100}";

	public static boolean isValidCredentials(String credentials) {
		Pattern credentialsPattern = Pattern.compile(VALID_CREDENTIALS_REGEX);
		Matcher credentialsMatcher = credentialsPattern.matcher(credentials);
		return credentialsMatcher.find();
	}

	public static void main(String[] labadien) {
	for(int i=0;i<=10;i++)	{
		Scanner scn = new Scanner(System.in);
	System.out.println("Enter fahrenheit ");
	 String temperature = scn.nextLine();
	 if(!isValidCredentials(temperature)) {
		 System.out.println("Type in number");
		 
	 }
	 else {
		 double n = Double.parseDouble(temperature);
		double celsius= (n-32)*5/9;
		double celsius1 = Math.round(celsius);
		System.out.println("This how much is in celsius" + " " + celsius1 );
	 }
	}
	
	}

}
