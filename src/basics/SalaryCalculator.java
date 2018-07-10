package basics;

public class SalaryCalculator {
	public static void main (String[] args) {
		//Let's create a variable to define our career
		
		// Declare a variable
		String career;
		System.out.println("Program is starting");
		
		//Define a variable
		career = "Software Developer";
		System.out.println("My career: " + career);
		
		//Declare and define
		int hoursPerWeek = 40;
		int weeksPerYear = 50;
		double rate = 42.50;
		
		 // to show we can re-define our variables
		career = "Web Developer"; // to show we can re-define our variables
		hoursPerWeek = 35;
		weeksPerYear = 45;
		rate = 55.75;
		// end
		
		double salary = hoursPerWeek * weeksPerYear * rate;
		System.out.println("My salary as a " + career + " at the rate of $" + rate + " is $ " + salary + " per year");
		
		// Compute our annual salary
		//rate * hoursPerWeek * weeksPerYear
	}

}
