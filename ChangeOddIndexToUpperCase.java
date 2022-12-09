package weekend.challanges;


public class ChangeOddIndexToUpperCase {

	public static void main(String[] args) {
		/*
		 Pseudo Code

		 * Declare String Input as Follow

		 * String test = "changeme";

		 * a) Convert the String to character array

		 * b) Traverse through each character (using loop)

		 * c)find the odd index within the loop (use mod operator)

		 * d)within the loop, change the character to uppercase, if the index is odd else don't change

		 */



		String test ="changeme";
		//Convert the String to character array
		
		char ch[] = test.toCharArray();
		//initialaize count
		
		int count = 0;
		
		System.out.println("Odd Numbers converted to uppercase : " );
		for (int i = 0; i !=ch.length; i++) {

			//find the index of each character
			count =test.indexOf(ch[i]);

			//System.out.println("Index of word is :" +ch[i] + " is = " +count);
			//find the odd index within the loop (use mod operator)
		
			if(count%2!=0) {
				//System.out.println("Odd numbers are :" +ch[i]);
				
				String str = String.valueOf(ch[i]);
				System.out.println(str.toUpperCase());


			}

			}
	}

}
