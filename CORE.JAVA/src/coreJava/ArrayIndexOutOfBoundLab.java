
// Q) Write a program using exception handling to handle array index out of bounds.


package coreJava;

public class ArrayIndexOutOfBoundLab {

public static void main(String[] args) 
		// Declare & initialise the array
		int arr[] = {5,20,45,65,47,14};


		// Declare try Catch block for handle exception
		try {

			
			for(int i = 0; i < 7; i++) {

				System.out.println(arr[i]);

			}

		}catch(ArrayIndexOutOfBoundsException e) {

			System.out.println("Exception Occurs Due to : "+e);

		}

	}

}



/*

 		Output :- 

 		10
		20
		45
		65
		47
		14
		Exception Occurs Due to : java.lang.ArrayIndexOutOfBoundsException: Index 6 out of bounds for length 6


 */

