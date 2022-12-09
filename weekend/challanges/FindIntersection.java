package weekend.challanges;

public class FindIntersection {

	public static void main(String[] args) {
		/*
		 * Pseudo Code
		
		 * a) Declare An array for {3,2,11,4,6,7};	 
		 * b) Declare another array for {1,2,8,4,9,7};
		 * c) Declare for loop iterator from 0 to array length
		 * d) Declare a nested for another array from 0 to array length
		 * e) Compare Both the arrays using a condition statement
		 
		 *  f) Print the first array (shoud match item in both arrays)
		 */
		
		
		//declare an array {3,2,11,4,6,7};
		int arr[]= {3,2,11,4,6,7};
		//Declare another array
		int arr1[] = {1,2,8,4,9,7};
		System.out.println("Matched items from array is : ");
		
		//decalre for loop 
		for(int i=0;i<arr.length;i++) {
			//System.out.println(arr[i]);
			//declare another for loop
			for(int j=0;j<arr1.length;j++) {

				//compare both array by using condition statement
				if(arr[i]==arr1[j]) {
					//print the first array which ia matched
					System.out.println(arr[i]);
				}
			}
		}
	}
}
