package weekend.challanges;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {

		//Declare a String value as "madam"

		Scanner name = new Scanner(System.in);
		 System.out.println("Enter name : ");
		
		String Origninalname = name.next();
		//Delcare Another string value as ""
		String rev = "";
		//Iterate over the string in reverse order
		for (int i = Origninalname.length()-1; i >=0 ; i--) {
			//add the char into rev  
			rev=rev+Origninalname.charAt(i);

		}
		System.out.println(rev);
		if(Origninalname.equalsIgnoreCase(rev)) {
			System.out.println("Palindrome");
		}
		else {
			System.out.println("Not a Palindrome");
		}
	}


}
