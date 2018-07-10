package basics;

public class NumbersCalc {
	public static void main (String[] args){
		// void means we are not returning anything
		printName();
		int numA = 10;
		int numB = 20;
		addNumbers(numA, numB);
		int productRet = multipleNumbers(numA, numB);
		System.out.println("The product of " + numA + " and " + numB + " is " + productRet);
		System.out.println("Dividing " + numB + " by " + numA + " is " + divideNumbers(numA, numB));
	}
	
	static void printName() {
		System.out.println("My name is Carlito");
	}

	// void means we are not returning anything
	static void addNumbers(int numberA, int numberB){
		//This function will add two numbers
		int sum = numberA + numberB;
		System.out.println("The sum of numbers " + numberA + " and " + numberB + " is: " + sum);
	}
	
	static int multipleNumbers(int valueA, int valueB){
		int product = valueA * valueB;
		// added the below to show that functions can be called from other functions
		// Also take note that we added 50 to one of the products
		addNumbers(product + 50, product);
		return product;
	}
	
	static int divideNumbers(int divA, int divB){
		int quotient = divB/divA;
		return quotient;
	}
}
