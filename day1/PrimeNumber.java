package week1.day1;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {

		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a number");
		int n=sc.nextInt();
		
		//examples 13 is prime 12 - Not a prime
		
		boolean bPrime=true;
		
		for (int i = 2; i < 9; i++) {
			
			if(n%i==0) {
				
				System.out.println("Not a Prime");
				bPrime=false;
				break;
			}
		}
			if(bPrime) {
				System.out.println("It is a Prime Number");
			}
		

	}

}
