package basics;

public class strings {

	public static void main(String[] args) {
		String bookTitle = "Lord of the Rings";
		String wordChoice = "Lord";
		
		if (bookTitle.contains("Ring")){
			System.out.println("The book contains the word Ring");
		}
		
		if (bookTitle.contains(wordChoice)){
			System.out.println("The book contains the word " + wordChoice);
		}
		else {
			System.out.println("The title does not have the word " + wordChoice);
		}
		
		if (wordChoice.equalsIgnoreCase("lord")){
			System.out.println("Ignoring cases - the word " + wordChoice + " is the same");
		}
		
		String firstName = "Carlos";
		String lastName = "Valle";
		String SSN = "123667783";
		
		System.out.println("The SSN has " + SSN.length() + " digits");
		
		System.out.println(firstName.substring(0,1) + lastName.substring(0,1) + SSN.substring(5));
		System.out.println("Now using print (no ln attached)");
		System.out.print(firstName.substring(0,1));
		System.out.print(lastName.substring(0,1));
		System.out.print(SSN.substring(5));
	}

}
