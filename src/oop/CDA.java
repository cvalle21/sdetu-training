package oop;

// Class added to extend the BA Class
public class CDA extends BA implements IRate {
	String interestRate;
	
	void compound(){
		System.out.println("Compound interest");
	}

}
