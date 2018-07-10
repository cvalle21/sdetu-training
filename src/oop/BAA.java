package oop;

public class BAA {
	public static void main (String[] args){
		//Testing overload method
		BA acct1 = new BA();

		//Encapsulation - main idea is to make the variables private - below, we do not want to assign
		// a name directly to a variable - not good practice
		// commented the following to show the proper more secure method - the below will not work
		// any longer since in the "BA" class, "name" has been changed to private
		//acct1.name = "Rodger Hue";
		
		//Encapsulation: public API methods - all about hiding
		//Using Encapsulation to demo the correct method - check in the "BA" class "Getters/Setters"
		acct1.setName("Rodger Hue");
		//This is the Getter method to get back the "name"
		System.out.println(acct1.getname());
		
		//Encapsulation - continued
		acct1.setSsn("767-890-5566");
		System.out.println("SSN: " + acct1.getSsn());
		
		acct1.accountNumber = "111111";
		//acct1.routingNumber = "234897" - will not work since we declared "routingNumber" as "final"
		
		acct1.balance = 2000;
		acct1.deposit(1500);
		acct1.deposit(1500);
		acct1.deposit(1500);
		acct1.withdraw(2000);
		
		// The below will not work because the "showActivity" method has been defined as private
		// it will only be available to the class itself
		//acct1.showActivity();
		//Polymorphism through overriding
		System.out.println(acct1.toString());
		//acct1.compound(); - will not work because parents do not inherit child methods
		
		//Interfaces: Whereas "Inheritance" is a parent child relationship, "Interfaces" is more 
		// of a contract - "CDA" is a child and inherits all from "BA" but "BA" does not inherit the
		// methods from "CDA"
		// With "Interface", "IRate" becomes available to "BA" and the main
		acct1.setRate();
		acct1.increaseRate();
		
		// Here we are calling the methods in the LoanAccount class (same call as the "BA" class
		// but with a different print
		LoanAccount acct1la = new LoanAccount();
		acct1la.setRate();
		acct1la.increaseRate();
		
		//Polymorphism through Overloading
		BA acct2 = new BA("Checking Account");
		acct2.accountNumber = "222222";
		
		BA acct3 = new BA("Savings Account", 5000);
		acct3.accountNumber = "333333";
		acct3.checkBalance();
		
		//Demo showing inheritence - CDA will inherit all from the parent BA class
		CDA cd1 = new CDA();
		cd1.balance = 3000;
		cd1.interestRate = "4.5";
		// commented the following to implement Encapsulation - check notes above on "acct1"
//		cd1.name = "Juan";
		
		// Encapsulation method
		cd1.setName("Juan");
		
		cd1.accountType = "CD Account";
		System.out.println(cd1.toString());
		cd1.compound();
		
		//Testing the static variable "routingNumber"
//		System.out.println("Routing Number: " + acct1.routingNumber);
//		System.out.println("Routing Number: " + acct2.routingNumber);
//		System.out.println("Routing Number: " + acct3.routingNumber);
		// the above will no longer work because in "BA" we have changed "routingNumber" to "private"
		// making this variable only available to the class
	}

}
