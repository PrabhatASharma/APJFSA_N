
package coreJava;

/*  
- Convert Primitive datatype to wrapper class is called Autoboxing
	- Two types of Autoboxing
		i)  Implicit 
		ii) Explicit 
 */


// Create class AutoBoxingClass for perform Autoboxing tasks

class AutoBxingClass{


	// Declaring method for perform implicit Autoboxing

	void implicitAutoBoxing() {

		int num = 20;
		Integer obj = num;    // Integer is wrapper class

		System.out.println("Implicit AutoBoxing : "+obj);  // obj is an object of wrapper class


	}


	// Declaring Method for perform Explicit Autoboxing 

	void explicitAutoBoxing() {

		int num = 40;
		Integer obj = Integer.valueOf(num);   // Explicit AutoBoxing

		System.out.println("Explicit AutoBoxing : "+obj);  // obj is an object of wrapper class
	}

}


public class AutoBoxing {

	public static void main(String[] args) {

		// Creating Object of AutoBoxingClass Class

		AutoBxingClass object = new AutoBxingClass();

		object.implicitAutoBoxing();
		object.explicitAutoBoxing();

	}

}



/* Output
 
Implicit AutoBoxing : 20
Explicit AutoBoxing : 40
*/
