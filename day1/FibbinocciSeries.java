package week1.day1;

public class FibbinocciSeries {

	public static void main(String[] args) {
	
		//output 
		//0,1,1,2,3,5,8,13,21,34,55,89,144 
		
		/*Initialize 3 int variables (Tip: firstNum = 0, secNum = 1, sum = 0)
		 * Print first number Iterate from 1 to the 11 
		 * Add first and second number assign to sum 
		 * Assign second number to the first number 
		 * assign sum to the second number Print sum
		 */

		//Initialize 3 int variables
		int firstNum= 0;
		int secNum=1,sum=0;
		//Print first number
		System.out.println("Fibbinocci Numbers are : ");
		System.out.println(firstNum);
		//System.out.println(c);
		//Iterate  numbers
		for(int i=1;i<=12;i++) {
			//Add first and second number assign to sum 
			sum =firstNum + secNum;
			//Assign second number to the first number
			secNum=firstNum;
			//assign sum to the First number
			firstNum =sum;
			//Print sum
			System.out.println(sum);
		}
		

	}

}
