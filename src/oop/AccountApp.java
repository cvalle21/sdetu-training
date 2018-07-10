package oop;

public class AccountApp {

	public static void main(String[] args) {
		LoanAccount la = new LoanAccount();
		
		la.increaseRate();
		la.setRate();
		la.setAmmortSchedule();
		la.setTerm(20);
		
		//Polymorphism - it is changing where we are pointing
		// The effect is that we use the methods in the IRate class that are common with 
		// the "LoanAccount" class
		IRate account1 = new LoanAccount();
		account1.increaseRate();
		account1.setRate();
	}

}
