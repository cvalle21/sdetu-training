package oop;

public class LoanAccount implements IRate {
	
	// Basically to demonstrate that "Interfaces" can be used by any class and can be implemented
	// differently

	@Override
	public void setRate() {
		System.out.println("The Rate has been set");
	}

	@Override
	public void increaseRate() {
		System.out.println("Increasing Rate is occurring");
	}
	
	public void setTerm(int term){
		System.out.println("Setting the term to: " + term + " years");
	}

	public void setAmmortSchedule(){
		System.out.println("Ammortization schedule");
	}
}
