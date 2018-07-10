package basics;

public class Days {
	public static void main (String[] args) {
		
		String dayOfWeek = "Friday";
		// The "breaks" are needed to break out once a case is satisfied - if no "breaks" are present,
		// once the case is met, the rest of the code will process - demonstrated on the second Switch
		
		switch (dayOfWeek) {
			case "Monday" : System.out.println("Today is Monday");
					break;
			case "Tuesday" : System.out.println("Today is Tuesday");
					break;
			case "Wednesday" : System.out.println("Today is Wednesday");
					break;
			case "Thursday" : System.out.println("Today is Thursday");
					break;
			case "Friday" : System.out.println("Today is Friday");
					break;
			case "Saturday" : System.out.println("Today is Saturday");
					break;
			case "Sunday" : System.out.println("Today is Sunday");
		}
		
		switch (dayOfWeek) {
			case "Monday" : System.out.println("Today is Monday - no break");
			case "Tuesday" : System.out.println("Today is Tuesday - no break");
			case "Wednesday" : System.out.println("Today is Wednesday - no break");
			case "Thursday" : System.out.println("Today is Thursday - no break");
			case "Friday" : System.out.println("Today is Friday - no break");
			case "Saturday" : System.out.println("Today is Saturday - no break");
			case "Sunday" : System.out.println("Today is Sunday - no break");
	}
	}

}
