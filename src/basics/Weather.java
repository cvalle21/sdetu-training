package basics;

public class Weather {
	public static void main(String[] args) {
		//This program will suggest what to wear based on the weather (temperature)
		
		int temperature = 80;
		String sunCondition = "Rain";
		
		if ((temperature >= 80) && (sunCondition == "Sunny")) {
			System.out.println("Temperature is pleasant - wear shorts and a T-Shirt");
		}
		else if ((temperature >= 80) && (sunCondition == "Rain")) {
			System.out.println("It is warm but use an umbrella");
		}
		else if ((temperature >= 65) && (sunCondition == "Sunny")) {
			System.out.println("Temperature is a little cooler - wear a long sleeve shirt and jeans");
		}
		else if ((temperature >= 35) && (sunCondition == "Sunny")) {
			System.out.println("It's cold but sunny");
		}
		else if ((temperature >= 35) && (sunCondition == "Rain")) {
			System.out.println("It's cold and you need an umbrella");
		}
		else if ((temperature >= 35) && (sunCondition == "Snow")) {
			System.out.println("It's cold and snowing");
		}
		else {
			System.out.println("Bundle up!");
		}
	}

}
