package testREGEX;

import java.util.regex.*;

public class REGEX1{
	public static void main(String args[]){
		String regex= "(dog)*\\d";
		String testedString= "dog123";
		boolean b = Pattern.matches(regex, testedString);
		System.out.println(" the result is " + b);

	/** test documentation 
	 * 
	 */
	}
}