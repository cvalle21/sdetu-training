package oop;

public class BankAccountApp {

	public static void main(String[] args) {
		// Creating a new bank account >> think instantiate an object
		BankAccount acc1 = new BankAccount();
		
		
		//acc1.name = "Rodger Dodger";
		//with Encapsulation: public API methods
		acc1.setName("Rodger Dodger");
		System.out.println(acc1.getName());
		
		acc1.setSSN("092-1088-65");
		System.out.println(acc1.getSSN());		
		
		acc1.accountNumber = "01689453";
		acc1.balance = 10000.00;
		System.out.println(acc1.toString());
		
		acc1.deposit(1500.00);
		acc1.deposit(1500.00);
		acc1.deposit(1500.00);
		acc1.withdraw(2000.00);
		System.out.println(acc1.toString());
		
/*		BankAccount acc2 = new BankAccount("Checking Account");
		acc1.accountNumber = "01689454";
		
		BankAccount acc3 = new BankAccount("Savings Account",1200.00);
		acc1.accountNumber = "01689455";		
		acc3.checkBalance();
		
		//Demo for Inheritance
		CDAccount cd1 = new CDAccount();
		cd1.balance = 3000.00;
		cd1.name = "Juan Gonzalez";
		cd1.accountNumber = "7789967";
		cd1.accountType = "CD Account";
		cd1.interestRate = "4.5";
		System.out.println(cd1.toString());
		cd1.compound(); 
*/
	}

}
