package oop;

public class BA implements IRate {
	// NOTE: because we are implementing Interfaces (check above), the methods in the Interface
	// has to be used in this class
	String accountNumber;
	// use static when the value does not change - common to all - this value belongs to the class
	// not the object - adding "final" will not allow changing of this value
	// General rule - when a variable is not going to change, use "static final"
	private static final String routingNumber = "0112233";
	
	// Instance variables available to the whole class
	private String name;
	private String ssn;
	String accountType;
	double balance = 0; // this make "balance" available to the whole class
	
	//Constructor definitions: unique methods
	//1. They are used to define or setup or initialize properties of an object
	//2. Constructors are IMPLICITLY called upon INSTANTIATION
	//3. The same name as the class itself
	//4. Constructors have NO return type
	
	//Overloading: call same method name with different arguments
	BA(){
		System.out.println("New Account Created - Overload 1");
	}
	
	BA(String accountType) {
		System.out.println("Account Type is " + accountType + " - Overload 2");
	}
	
	BA(String accountType, double initDeposit) {
		//initDeposit, goodMsg, Msg are local variables
		System.out.println("Account Type is " + accountType + " - Overload 3");
		System.out.println("Initial Desposit is $" + initDeposit + " - Overload 3");
		String goodMsg = null;
		if (initDeposit < 1000){
			String Msg = "ERROR: Minimum deposit must be at least $1000.00";
			System.out.println(Msg);
		} else {
			goodMsg = "Thanks for your initial deposit of $" + initDeposit;
		}
		//System.out.println(errorMsg); - will not work since "errorMsg" is defined in the "if" block
		System.out.println(goodMsg); //will work since goodMsg is declared above
		balance = balance + initDeposit;
	}
	
	// Getters / Setters - must be placed after the Constructors - used to demo Encapsulation
	// The following will allow the user to define the "name"
	// "public" to make it available to the user, "void" since we are not returning anything, a name
	// for the method 
	public void setName(String name){
		// "this" refers to the variable "name" (look above at the variable declarations)
		// "Mr." was added to show we can manipulate variables
		this.name = "Mr. " + name;
	}	
	public String getname() {
		return name;
	}
	
	public String getSsn() {
		return ssn;
	}
	public void setSsn(String ssn) {
		this.ssn = ssn;
	}
	
	
	//Interface implementation
	// Here we are coding what the method should do - in this case print 
	public void setRate(){
		System.out.println("SETTING RATE");
	}
	public void increaseRate(){
		System.out.println("INCREASING RATE");
	}
	
	
	//Define methods (functions are called methods)
	// adding public makes these methods available throughout the project
	public void deposit(double amount){
		//System.out.println(initDeposit); - will not work since variables are only defined 
		//in the block they were defined - in this case "BA(String accounType, double initDeposit)
		//constructor
		balance = balance + amount;
		showActivity("DEPOSIT");		
	}
	
	// The following method will be available only within the package (package oop)
	void withdraw(double withdAmt){
		balance = balance - withdAmt;
		showActivity("WITHDRAW");
	}
	
	void checkBalance(){
		System.out.println("Balance: $" + balance);
	}
	
	void getStatus(){
		
	}
	
	// private only allows the method to be available within the class
	private void showActivity(String activity) {
		System.out.println("Your recent transaction: " + activity);
		System.out.println("Your new balance is $" + balance);
	}
	
	//Method to override the JAVA built in "toString" method
	@Override
	public String toString(){
		// "routingNumber" is printed here because it is available to the class - will not be able
		// to get this value outside of this "BA" class 
		return "[ NAME: " + name + " /ACCOUNT#: " + accountNumber + " /ROUTING#: " + routingNumber + " /BALANCE: $" + balance + " ]"; 
	}
}
