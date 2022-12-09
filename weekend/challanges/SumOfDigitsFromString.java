package weekend.challanges;

import java.util.Iterator;

public class SumOfDigitsFromString {

	public static void main(String[] args) {

		/*
		 * Method 1
		 * Pseudo Code

		 * Declare a String text with the following value
			String text = "Tes12Le79af65";
		   Declare a int variable sum
			int sum = 0;
		 * a) using replaceAll(), replace all the non-digits into ""
		 * b) Now, convert the String into array
		 * c) Iterate over the array and get each character
		 * d) Using Character.getNumericValue(), Change the char into int
		 * e) Add the values to sum & print
		 * 
		 */

		String test = "Tes12Le79af65"; 
		int sum=0;
		int values = 0;
		String replaceValue =test.replaceAll("[0-9]", "");
		
		char[] ch=replaceValue.toCharArray();
		//System.out.println(ch);
		
		for (int i = 0; i < ch.length; i++) {

			values=Character.getNumericValue(replaceValue.charAt(i));
			System.out.println(values);
			// Add the values to sum & print
			sum =sum+values;
		}
		System.out.println("sum of the values : " +sum);
	}



}
