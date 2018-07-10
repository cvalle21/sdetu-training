package oop;

public class BankAccount {
	String accountNumber;
	//Declare routingNumber to be one value only (with static)
	//Add final to disallow main program to change it
	//static >> belongs to the Class not object instance
	//final >> constant (often static final)
	private static final String routingNumber = "013546";
	//Instance variables
	private String name;
	private String ssn;
	//String accountType;
	Double balance = 0.00;
	
	// Constructor definitions: unique methods
		//1. They are used to define or setup or initialize properties of an object
		//2. Constructors are IMPLICITLY called upon INSTANTIATION
		//3. The same name as the class itself
		//4. Constructors have NO return type
	//Overloading: call same method name with different arguments
	BankAccount(){
		System.out.println("NEW ACCOUNT CREATED");
	}

	BankAccount(String accountType){
		System.out.println("NEW ACCOUNT: " + accountType);
	}
	
	BankAccount(String accountType, Double initDeposit){
		//Msg, initDeposit, accountType are local variables - only good within the block
		System.out.println("NEW ACCOUNT: " + accountType);
		System.out.println("NEW DEPOSIT: $" + initDeposit);
		String Msg = null;
		
		if (initDeposit < 1000.00){
			Msg = "ERROR: Minimum deposit must be at least $1000";
		} else {
			Msg = "Thanks for your initial deposit";	
		}
		System.out.println(Msg);
		balance = balance + initDeposit;
	}	
	
	// Define Methods - made public to be available throughout package
	public void deposit(Double amount){
		balance = balance + amount;
		showActivity("DEPOSIT");		
	}
	
	public void withdraw(Double amount){
		balance = balance - amount;
		showActivity("WITHDRAW");
	}
	
	public void checkBalance(){
		System.out.println("Balance: $" + balance);
	}
	
	public void getStatus(){
		
	}
	
	// Private can only be called from this class
	private void showActivity(String activity){
		System.out.println("Your recent transaction: " + activity);
		System.out.println("Your account balance: " + balance);
	}
	
	//Getter/Setter
	//Allow the user to define the name 
	public void setName(String name){
		this.name = "Mr. " + name; //sets the name for this class to the attribute name which is private and makes it available to this whole class (like a global variable)
	}
	
	//Allow user to get name
	public String getName(){
		return name;
	}
	
	public void setSSN(String ssn){
		this.ssn = ssn; //sets the ssn for this class to the attribute ssn which is private and makes it available to this whole class (like a global variable)
	}
	
	//Allow user to get name
	public String getSSN(){
		return ssn;
	}
	
	//Use Override as follows to override methods inherited from the Java itself
	@Override
	public String toString(){
		return "[Name: " + name + "  Routing Number: " + routingNumber + "  Account Number: " + accountNumber + "  BALANCE: $" + balance + "]";
	}
}
