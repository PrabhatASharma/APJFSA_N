
// Q) Write a program demonstrating multiple catch statements and finally block.


package coreJava;

public class MultipleCatchFinally {


	public static void main(String[] args) {

		
		String str = null;


		try {

			// Display length of the String 
			System.out.println("Length of the String : "+str.length());

		}
		catch (ArithmeticException e) {									

			System.out.println("Arithmatic Exception Occurs "+e);
		}
		catch (ArrayIndexOutOfBoundsException e) {						

			System.out.println("Array Index Out of Bound Exception Occurs "+e);
		}
		catch (NullPointerException e) {								
			

			System.out.println("Null Pointer Exception Occurs "+e);
		}


		// Declare an Finally Block 
		finally {

			System.out.println("This is an finally Block......");

		}


	}

}



/*

  	Output :-

  	Null Pointer Exception Occurs java.lang.NullPointerException: Cannot invoke "String.length()" because "str" is null
		This is an finally Block......


 */

