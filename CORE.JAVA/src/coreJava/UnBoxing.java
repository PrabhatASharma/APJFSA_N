package coreJava;
/*
- Convert wrapper class to Primitive datatype is called Unboxing
- Two types of Unboxing
	i)  Implicit 
	ii) Explicit 

*/
// Create an class for perform operations

class UnBoxingClass{
	
	// Create method for perform Implicit unboxing task
	
	void implicitUnBoxing() {
		
		Integer obj = new Integer(40);    // Declaring and initilising wrapper class 
		
		int number = obj;				  // COnvert wrapper class to primitive datatype
		
		System.out.println("Implicit UnBoxing : "+number);
		
	}

	
	// Create method for perform Explicit unboxing task
	
	void explicitUnBoxing() {
		
		Integer obj = new Integer(20);
		
		int number = obj.intValue();   		//  intValue is an predefined function used for convert wrapper class object to int datatype
		
		System.out.println("Explicit UnBoxing : "+number);
		
	}
	
}


public class UnBoxing {

	public static void main(String[] args) {

		// Create an object of UnBoxingClass Class
		
		UnBoxingClass object = new UnBoxingClass();
		
		object.implicitUnBoxing();
		object.explicitUnBoxing();
		

	}

}

/* Output
Implicit UnBoxing : 40
Explicit UnBoxing : 20
*/
