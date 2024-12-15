
// Q) Write a program demonstrating  Exception handling using try catch for Arithmatic Exception.


package coreJava;
public class ArithmaticExceptionL {


	public static void main(String[] args) {
		
		int num1 = 20;

		int num2 = 0;


		// Perform division operation into the try block
		try {

			float ans = num1/num2;
			System.out.println("Division is : "+ans);		

		}catch (ArithmeticException e) 
		{			// Handle Arithmatic Exception 

			System.out.println("Exception Occurs due to - "+e);

		}

	}

}



/*
 		Output :- 
  Exception Occurs due to - java.lang.ArithmeticException: / by zero

 */


