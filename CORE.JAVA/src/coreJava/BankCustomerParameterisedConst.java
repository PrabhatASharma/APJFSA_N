
// Write a java program to create Bankcustomer class with acno,atype,amt fields using parameterized constructor?


package coreJava;

// Create an private class 

class BankCustomers{
	
	int accountNumber;
	String accountType;
	double amount;
	
	// Declare Parameterised constructor which initialising instance variable.
	
	public BankCustomers(int accountNumber, String accountType, double amount) {
		
		this.accountNumber = accountNumber;
		this.accountType = accountType;
		this.amount = amount;
	}
	
	
	// Create Method for display values of variable
	public void display() {
		
		System.out.println("Account Number : "+this.accountNumber);
		System.out.println("Account Type : "+this.accountType);
		System.out.println("Amount in Account : "+this.amount);
		
	}
		
}



public class BankCustomerParameterisedConst {

	public static void main(String[] args) {
		
		// Creating Object of BankCustomers Class with passing parameters for parameterised constructor
		BankCustomers obj = new BankCustomers(1245, "Salary", 9000);
		
		
		// Calling display method
		obj.display();

	}

}




/*
 	
 	Output : 
 	
 	Account Number : 1245
	Account Type : Salary
	Amount in Account : 9000.0

  
  
*/ 
